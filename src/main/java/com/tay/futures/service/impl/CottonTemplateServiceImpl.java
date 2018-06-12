package com.tay.futures.service.impl;

import com.tay.futures.dao.CottonTemplateMapper;
import com.tay.futures.entity.CottonTemplate;
import com.tay.futures.entity.CottonTemplateExample;
import com.tay.futures.entity.RangeStrategy;
import com.tay.futures.entity.RatioStrategy;
import com.tay.futures.service.CottonTemplateService;
import com.tay.futures.service.RangeStrategyService;
import com.tay.futures.service.RatioStrategyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("cottonTemplateService")
public class CottonTemplateServiceImpl implements CottonTemplateService{

    @Autowired
    private CottonTemplateMapper cottonTemplateMapper;

    @Autowired
    private RangeStrategyService rangeStrategyService;

    @Autowired
    private RatioStrategyService ratioStrategyService;


    @Override
    public Long addTemplate(CottonTemplate cottonTemplate) {
         cottonTemplateMapper.insertSelective(cottonTemplate);
         return cottonTemplate.getId();
    }


    @Override
    public Integer updateTemplate(CottonTemplate cottonTemplate) {
        return cottonTemplateMapper.updateByPrimaryKeySelective(cottonTemplate);
    }


    @Override
    public Long addTemplateAndStrategy(CottonTemplate cottonTemplate,RatioStrategy ratioStrategy ,List<RangeStrategy> rangeStrategyList) {
        Long templateId=addTemplate(cottonTemplate);
        ratioStrategy.setTemplateId(templateId);
        ratioStrategyService.addStrategy(ratioStrategy);
        for(RangeStrategy rangeStrategy:rangeStrategyList){
            rangeStrategy.setTemplateId(templateId);
        }
        rangeStrategyService.addRangeStrategyList(rangeStrategyList);
        return templateId;
    }




    @Override
    public List<CottonTemplate> getAllCottonTemplateByUid(Integer userId) {
        CottonTemplateExample cottonTemplateExample=new CottonTemplateExample();
        cottonTemplateExample.createCriteria().andCreatorIdEqualTo(userId.longValue());
        return cottonTemplateMapper.selectByExample(cottonTemplateExample);
    }


    @Override
    public CottonTemplate getCottonTemplateById(Long templateId) {
        return cottonTemplateMapper.selectByPrimaryKey(templateId);
    }



    @Override
    public Integer deleteById(Long templateId) {
        rangeStrategyService.deleteRangeStrategyByTemplateId(templateId);
        return cottonTemplateMapper.deleteByPrimaryKey(templateId);
    }
}
