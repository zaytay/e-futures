package com.tay.futures.service.impl;

import com.tay.futures.dao.CottonTemplateMapper;
import com.tay.futures.entity.CottonTemplate;
import com.tay.futures.entity.RangeStrategy;
import com.tay.futures.service.CottonTemplateService;
import com.tay.futures.service.RangeStrategyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("cottonTemplateService")
public class CottonTemplateServiceImpl implements CottonTemplateService{

    @Autowired
    private CottonTemplateMapper cottonTemplateMapper;

    @Autowired
    private RangeStrategyService rangeStrategyService;


    @Override
    public Long addTemplate(CottonTemplate cottonTemplate) {
         cottonTemplateMapper.insertSelective(cottonTemplate);
         return cottonTemplate.getId();
    }


    @Override
    public Long addTemplateAndStrategy(CottonTemplate cottonTemplate, List<RangeStrategy> rangeStrategyList) {
        Long templateId=addTemplate(cottonTemplate);

        for(RangeStrategy rangeStrategy:rangeStrategyList){
            rangeStrategy.setTemplateId(templateId);
        }
        rangeStrategyService.batchAddRangeStrategy(rangeStrategyList);

        return null;
    }
}
