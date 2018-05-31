package com.tay.futures.service;

import com.tay.futures.entity.RangeStrategy;

import java.util.List;

public interface RangeStrategyService {

    public List<RangeStrategy> getStrategyByTemplateIdAndType(Long temId,Integer type);


    public Long addRangeStrategy(RangeStrategy rangeStrategy);


    public void batchAddRangeStrategy(List<RangeStrategy> rangeStrategyList);

}
