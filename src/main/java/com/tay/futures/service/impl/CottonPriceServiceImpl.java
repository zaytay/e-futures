package com.tay.futures.service.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.tay.futures.constants.CottonConst;
import com.tay.futures.constants.RangeStrategyType;
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

import java.util.List;
import java.util.Map;

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



    public static Double computeRatioPrice(Map<String,Object>  ratioMap, Map<String,Object> priceMap,Double price){
        for(Map.Entry<String,Object> entry:priceMap.entrySet()){
            if(CottonConst.ratioPriceSet.contains(entry.getKey())){
                price+=(Double)ratioMap.get(entry.getKey()) *  (Double) entry.getValue();
            }
        }
        return price;
    }




    private Double rangePriceCalculate(double currentValue,List<RangeStrategy>  rangeStrategies) throws ServiceException {
        RangeStrategy rangeStrategy=rangeMatch(currentValue,rangeStrategies);
        if (rangeStrategy == null){
            logger.error("currentValue:{} not match any range");
            throw new BusinessException(ErrorCode.RANGE_NOT_MATCH);
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
