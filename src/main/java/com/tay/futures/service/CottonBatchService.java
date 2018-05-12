package com.tay.futures.service;

import com.tay.futures.entity.CottonBatch;
import com.tay.futures.util.PageInfo;

public interface CottonBatchService   {


    public PageInfo<CottonBatch> getCottonBatchByPage(Integer pageNo, Integer pageSize);
}
