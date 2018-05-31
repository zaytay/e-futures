package com.tay.futures.service;

import com.tay.futures.entity.CottonTemplate;
import com.tay.futures.entity.RangeStrategy;

import java.util.List;

public interface CottonTemplateService {

    public Long addTemplate(CottonTemplate cottonTemplate);


    public Long addTemplateAndStrategy(CottonTemplate cottonTemplate, List<RangeStrategy> rangeStrategyList);


}
