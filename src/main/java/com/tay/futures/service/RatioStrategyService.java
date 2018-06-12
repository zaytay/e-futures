package com.tay.futures.service;


import com.tay.futures.entity.RatioStrategy;

import java.util.List;

public interface RatioStrategyService {




    public Long addStrategy(RatioStrategy ratioStrategy);


    public void addStrategyList(List<RatioStrategy> strategyList);

    public List<RatioStrategy> getStrategyByTemplateId(Long templateId);


    public Integer deleteStrategyByTemplateId(Long templateId);

}
