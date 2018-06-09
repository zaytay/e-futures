package com.tay.futures.service;

import com.tay.futures.entity.RangeStrategy;

import java.util.List;

public interface RangeStrategyService {

    public List<RangeStrategy> getStrategyByTemplateIdAndType(Long temId,Integer type);


    public Long addRangeStrategy(RangeStrategy rangeStrategy);


    public void addRangeStrategyList(List<RangeStrategy> rangeStrategyList);

    public List<RangeStrategy> getStrategyByTemplateId(Long templateId);


    public Integer deleteRangeStrategyByTemplateId(Long  templateId);

}
