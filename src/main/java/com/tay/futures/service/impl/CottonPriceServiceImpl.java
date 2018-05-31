package com.tay.futures.service.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.tay.futures.constants.RangeStrategyType;
import com.tay.futures.entity.CottonBatch;
import com.tay.futures.entity.RangeStrategy;
import com.tay.futures.exception.ServiceException;
import com.tay.futures.service.CottonBatchService;
import com.tay.futures.service.CottonPriceService;
import com.tay.futures.service.RangeStrategyService;
import com.tay.futures.util.PriceUtil;
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

    @Override
    public Double computePrice(Long productionCode,Long templateId) throws Exception{

        CottonBatch cottonBatch=cottonBatchService.getCottonBatchByCode(productionCode);
        Double price=0.00;
        if(cottonBatch == null){
            return null;
        }else {
            ObjectMapper m = new ObjectMapper();
            Map<String,Object> propsMap = m.convertValue(cottonBatch, Map.class);

            //ratio strategy calculate
            price=PriceUtil.computeColourLevelPrice(propsMap,price);
            price=PriceUtil.computeGinningQualityPrice(propsMap,price);

            //range strategy calculate
            for(RangeStrategyType type:RangeStrategyType.values()){
                List<RangeStrategy> rangeStrategies = rangeStrategyService.getStrategyByTemplateIdAndType(templateId, type.getCode());
                double currentValue=(Double)propsMap.get(type.getAttributeName());
                price+=rangePriceCalculate(currentValue,rangeStrategies);
            }
            return price;
        }

    }





    private Double rangePriceCalculate(double currentValue,List<RangeStrategy>  rangeStrategies) throws ServiceException {
        RangeStrategy rangeStrategy=rangeMatch(currentValue,rangeStrategies);
        if (rangeStrategy == null){
            logger.error("currentValue:{} not match any range");
            throw new ServiceException("currentValue not match any range");
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
