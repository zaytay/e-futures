package com.tay.futures.service.impl;

import com.tay.futures.dao.RatioStrategyMapper;
import com.tay.futures.entity.RatioStrategy;
import com.tay.futures.entity.RatioStrategyExample;
import com.tay.futures.service.RatioStrategyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RatioStrategyServiceImpl implements RatioStrategyService {

    @Autowired
    private RatioStrategyMapper ratioStrategyMapper;




    @Override
    public List<RatioStrategy> getStrategyByTemplateId(Long templateId) {
        RatioStrategyExample example=new RatioStrategyExample();
        example.createCriteria().andTemplateIdEqualTo(templateId);
        return ratioStrategyMapper.selectByExample(example);
    }


    @Override
    public Long addStrategy(RatioStrategy strategy) {
        ratioStrategyMapper.insertSelective(strategy);
        return strategy.getId();
    }


    //todo  modify batch Insert
    @Override
    public void addStrategyList(List<RatioStrategy> strategyList) {
        for(RatioStrategy strategy:strategyList){
            addStrategy(strategy);
        }
    }



    @Override
    public Integer deleteStrategyByTemplateId(Long  templateId) {
        RatioStrategyExample strategyExample=new RatioStrategyExample();
        strategyExample.createCriteria().andTemplateIdEqualTo(templateId);
        return ratioStrategyMapper.deleteByExample(strategyExample);
    }

}
