package com.tay.futures.service.impl;

import com.tay.futures.dao.CottonItemMapper;
import com.tay.futures.entity.CottonItem;
import com.tay.futures.entity.CottonItemExample;
import com.tay.futures.service.CottonItmeService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CottonItemServiceImpl implements CottonItmeService{


    @Autowired
    private CottonItemMapper cottonItemMapper;

    @Override
    public List<CottonItem> getCottonItemByBatchId(Long batchId) {
        CottonItemExample example=new CottonItemExample();
        example.createCriteria().andBatchIdEqualTo(batchId);
        return cottonItemMapper.selectByExample(example);
    }
}
