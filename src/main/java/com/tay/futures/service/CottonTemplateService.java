package com.tay.futures.service;

import com.tay.futures.entity.CottonTemplate;
import com.tay.futures.entity.RangeStrategy;
import com.tay.futures.vo.TemplateVo;

import java.util.List;

public interface CottonTemplateService {

    public Long addTemplate(CottonTemplate cottonTemplate);


    public Long addTemplateAndStrategy(CottonTemplate cottonTemplate, List<RangeStrategy> rangeStrategyList);

    public List<CottonTemplate> getAllCottonTemplateByUid(Integer userId);


    public CottonTemplate getCottonTemplateById(Long templateId);

    public Integer updateTemplate(CottonTemplate cottonTemplate);

    Integer deleteById(Long templateId);

}
