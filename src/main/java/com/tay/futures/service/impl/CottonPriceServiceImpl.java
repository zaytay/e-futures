package com.tay.futures.service.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.tay.futures.constants.CottonConst;
import com.tay.futures.constants.RangeStrategyType;
import com.tay.futures.dto.CottonBatchDto;
import com.tay.futures.entity.CottonBatch;
import com.tay.futures.entity.RangeStrategy;
import com.tay.futures.entity.RatioStrategy;
import com.tay.futures.exception.BusinessException;
import com.tay.futures.exception.ErrorCode;
import com.tay.futures.exception.ServiceException;
import com.tay.futures.service.CottonBatchService;
import com.tay.futures.service.CottonPriceService;
import com.tay.futures.service.RangeStrategyService;
import com.tay.futures.service.RatioStrategyService;
import com.tay.futures.util.PriceUtil;
import org.apache.commons.collections.CollectionUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.HashSet;

@Service("cottonPriceService")
public class CottonPriceServiceImpl implements CottonPriceService{


    private static Logger logger= LoggerFactory.getLogger(CottonPriceService.class);

    @Autowired
    private CottonBatchService cottonBatchService;

    @Autowired
    private RangeStrategyService rangeStrategyService;

    @Autowired
    private RatioStrategyService ratioStrategyService;

    @Override
    public Double computePrice(Long productionCode,Long templateId) throws BusinessException, ServiceException {

        CottonBatch cottonBatch=cottonBatchService.getCottonBatchByCode(productionCode);
        Double price=0.00;
        if(cottonBatch == null){
            throw new BusinessException(ErrorCode.CODE_NOT_EXIST);
        }else {
            ObjectMapper m = new ObjectMapper();
            Map<String,Object> propsMap = m.convertValue(cottonBatch, Map.class);

            //ratio strategy calculate

            List<RatioStrategy> ratioStrategyList=ratioStrategyService.getStrategyByTemplateId(templateId);
            if(CollectionUtils.isEmpty(ratioStrategyList) || ratioStrategyList.get(0) == null){
                throw new BusinessException(ErrorCode.CODE_NOT_EXIST);
            }

            Map<String,Object> priceMap=m.convertValue(ratioStrategyList.get(0),Map.class);
            price=computeRatioPrice(propsMap,priceMap,price);

            Double promot_fix = computeFixStrategy(propsMap);
            price += promot_fix;

            //price=PriceUtil.computeColourLevelPrice(propsMap,price);
            //price=PriceUtil.computeGinningQualityPrice(propsMap,price);
            //range strategy calculate
            for(RangeStrategyType type:RangeStrategyType.values()){
                List<RangeStrategy> rangeStrategies = rangeStrategyService.getStrategyByTemplateIdAndType(templateId, type.getCode());
                double currentValue=(Double)propsMap.get(type.getAttributeName());
                price+=rangePriceCalculate(currentValue,rangeStrategies);
            }
            return price;
        }

    }



    public List<CottonBatchDto> batchComputePrice(List<CottonBatchDto> cottonBatchList, Long templateId) throws  ServiceException {

        Assert.notEmpty(cottonBatchList);


        //ratioStrategy prepare
        List<RatioStrategy> ratioStrategyList=ratioStrategyService.getStrategyByTemplateId(templateId);
        if(CollectionUtils.isEmpty(ratioStrategyList) || ratioStrategyList.get(0) == null){
            throw new BusinessException(ErrorCode.CODE_NOT_EXIST);
        }
        ObjectMapper objectMapper = new ObjectMapper();
        Map<String,Object> priceMap=objectMapper.convertValue(ratioStrategyList.get(0),Map.class);


        //range strategy prepare
        Map<Integer,List<RangeStrategy>>  strategyListMap=new HashMap<>();
        for(RangeStrategyType type:RangeStrategyType.values()){
            List<RangeStrategy> rangeStrategies = rangeStrategyService.getStrategyByTemplateIdAndType(templateId, type.getCode());
            strategyListMap.put(type.getCode(),rangeStrategies);
        }

        for(CottonBatchDto cottonBatchDto:cottonBatchList){
            Double price=0.00;
            ObjectMapper m = new ObjectMapper();
            Map<String,Object> propsMap = m.convertValue(cottonBatchDto, Map.class);
            //ratio strategy calculate
            price=computeRatioPrice(propsMap,priceMap,price);

            Double promot_fix = computeFixStrategy(propsMap);
            price += promot_fix;

            for(RangeStrategyType type:RangeStrategyType.values()){
                List<RangeStrategy> rangeStrategies = strategyListMap.get(type.getCode());
                double currentValue=(Double)propsMap.get(type.getAttributeName());
                price+=rangePriceCalculate(currentValue,rangeStrategies);
            }
            cottonBatchDto.setPrice(price);
        }
        return cottonBatchList;
    }




    private Double computeFixStrategy(Map<String, Object> propsMap) {
        Double promot_color_topic = computeColorTopic(propsMap);
        return promot_color_topic;
    }

    private Double computeColorTopic(Map<String, Object> propsMap) {
        Double ret = 0.0;
        String [] color_level_list = {
                "colourW1", "colourW2", "colourW3", "colourW4", "colourW5",
                "colourL1", "colourL2", "colourL3",
                "colourLy1", "colourLy2", "colourLy3",
                "colourY1", "colourY2"
        };
        Map<String,String> color_level_2_color_type = new HashMap<String, String>();
        color_level_2_color_type.put("colourW1","colourW");
        color_level_2_color_type.put("colourW2","colourW");
        color_level_2_color_type.put("colourW3","colourW");
        color_level_2_color_type.put("colourW4","colourW");
        color_level_2_color_type.put("colourW5","colourW");
        color_level_2_color_type.put("colourL1","colourL");
        color_level_2_color_type.put("colourL2","colourL");
        color_level_2_color_type.put("colourL3","colourL");
        color_level_2_color_type.put("colourLy1","colourLy");
        color_level_2_color_type.put("colourLy2","colourLy");
        color_level_2_color_type.put("colourLy3","colourLy");
        color_level_2_color_type.put("colourY1","colourY");
        color_level_2_color_type.put("colourY2","colourY");

        Map<String, List<String>> color_level_neayby= new HashMap<String, List<String>>();
        color_level_neayby.put("colourW1", Arrays.asList("colourL1","colourW2") );
        color_level_neayby.put("colourW2", Arrays.asList("colourL1","colourW1","colourW3") );
        color_level_neayby.put("colourW3", Arrays.asList("colourL1","colourL2","colourW2","colourW4"));
        color_level_neayby.put("colourW4", Arrays.asList("colourL2","colourL3","colourW3","colourW5"));
        color_level_neayby.put("colourW5", Arrays.asList("colourL3","colourW4"));
        color_level_neayby.put("colourL1", Arrays.asList("colourW1","colourW2","colourW3","colourLy1","colourL2","colourLy2"));
        color_level_neayby.put("colourL2", Arrays.asList("colourW3","colourW4","colourLy2","colourL1","colourL3","colourLy1","colourLy3"));
        color_level_neayby.put("colourL3", Arrays.asList("colourW4","colourW5","colourLy3","colourL2","colourLy2"));
        color_level_neayby.put("colourLy1", Arrays.asList("colourL1","colourY1","colourLy2","colourL2"));
        color_level_neayby.put("colourLy2", Arrays.asList("colourL2","colourY1","colourY2","colourL1","colourL3"));
        color_level_neayby.put("colourLy3", Arrays.asList("colourL3","colourY2","colourLy2","colourL2"));
        color_level_neayby.put("colourY1", Arrays.asList("colourLy1","colourLy2","colourY2"));
        color_level_neayby.put("colourY2", Arrays.asList("colourLy2","colourLy3","colourY1"));

        //TODO 8032 nearby
        String topic_80 = "";
        for (String color_level : color_level_list)
        {
            if( (Double)propsMap.get(color_level) >= 80.0 )
            {
                topic_80 = color_level;
                break;
            }
        }
        if( "" == topic_80)
        {
            return ret;
        }
        int colot_level_num = 1;
        Set<String> set_color_type = new HashSet<String>();
        set_color_type.add(color_level_2_color_type.get(topic_80));
        for ( String color_level : color_level_list )
        {
            if ( color_level == topic_80)
            {
                continue;
            }
            if( (Double)propsMap.get(color_level) > 0.0 )
            {
                colot_level_num += 1;
                set_color_type.add(color_level_2_color_type.get(color_level));
                if( 3 < colot_level_num || 2 < set_color_type.size() || ! color_level_neayby.get(topic_80).contains(color_level))
                {
                    return ret;
                }
            }
        }
        return ret+100;
    }


    public static Double computeRatioPrice(Map<String,Object>  ratioMap, Map<String,Object> priceMap,Double price){
        for(Map.Entry<String,Object> entry:priceMap.entrySet()){
            if(CottonConst.ratioPriceSet.contains(entry.getKey())){
                price+=(Double)ratioMap.get(entry.getKey()) *  (Double) entry.getValue() / 100;
            }
        }
        return price;
    }




    private Double rangePriceCalculate(double currentValue,List<RangeStrategy>  rangeStrategies) throws ServiceException {
        RangeStrategy rangeStrategy=rangeMatch(currentValue,rangeStrategies);
        if (rangeStrategy == null){
            logger.warn("currentValue:{} not match any range");
            return 0.0;
        }
        return rangeStrategy.getPrice();
    }




    private RangeStrategy rangeMatch(double currentValue,List<RangeStrategy> rangeStrategies){
        for(RangeStrategy rangeStrategy:rangeStrategies){
            if(currentValue <=rangeStrategy.getMax() && currentValue>= rangeStrategy.getMin()){
                return rangeStrategy;
            }
        }
        return null;
    }






}
