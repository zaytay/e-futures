package com.tay.futures.service;

import com.tay.futures.entity.CottonBatch;
import com.tay.futures.util.PageInfo;

import java.util.List;

public interface CottonBatchService   {


    public PageInfo<CottonBatch> getCottonBatchByPage(Integer pageNo, Integer pageSize);



    public List<CottonBatch> getAllCottonBatch();
}
