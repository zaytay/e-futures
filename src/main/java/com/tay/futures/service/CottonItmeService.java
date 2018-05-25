package com.tay.futures.service;

import com.tay.futures.entity.CottonItem;

import java.util.List;

public interface CottonItmeService {

    public List<CottonItem> getCottonItemByBatchId(Long batchId);
}
