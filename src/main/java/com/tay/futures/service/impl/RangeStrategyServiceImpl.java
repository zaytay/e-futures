package com.tay.futures.service.impl;

import com.tay.futures.dao.RangeStrategyMapper;
import com.tay.futures.entity.RangeStrategy;
import com.tay.futures.entity.RangeStrategyExample;
import com.tay.futures.service.RangeStrategyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RangeStrategyServiceImpl implements RangeStrategyService {

    @Autowired
    private RangeStrategyMapper rangeStrategyMapper;

    @Override
    public List<RangeStrategy> getStrategyByTemplateIdAndType(Long templateId,Integer type) {
        RangeStrategyExample example=new RangeStrategyExample();
        example.createCriteria().andTemplateIdEqualTo(templateId).andTypeEqualTo(type.byteValue());
        return rangeStrategyMapper.selectByExample(example);
    }


    @Override
    public Long addRangeStrategy(RangeStrategy rangeStrategy) {
        rangeStrategyMapper.insertSelective(rangeStrategy);
        return rangeStrategy.getId();
    }


    //todo  modify batch Insert
    @Override
    public void batchAddRangeStrategy(List<RangeStrategy> rangeStrategyList) {
        for(RangeStrategy rangeStrategy:rangeStrategyList){
            addRangeStrategy(rangeStrategy);
        }
    }
}
