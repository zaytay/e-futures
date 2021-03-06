package com.tay.futures.service;

import com.tay.futures.entity.CottonBatch;
import com.tay.futures.util.PageInfo;

import java.util.List;

public interface CottonBatchService   {


    public PageInfo<CottonBatch> getCottonBatchByPage(Integer pageNo, Integer pageSize);



    public List<CottonBatch> getAllCottonBatch();


    public CottonBatch getCottonBatchByCode(Long code);

    public void deleteAllCottonBaches();


    public List<CottonBatch> getCottonBatchListByCodes(List<Long> codeList);
}
