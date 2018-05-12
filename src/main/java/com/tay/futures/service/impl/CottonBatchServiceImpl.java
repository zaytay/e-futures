package com.tay.futures.service.impl;

import com.tay.futures.dao.CottonBatchMapper;
import com.tay.futures.entity.CottonBatch;
import com.tay.futures.entity.CottonBatchExample;
import com.tay.futures.service.CottonBatchService;
import com.tay.futures.util.PageInfo;
import com.tay.futures.util.PageUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("cottonBatchService")
public class CottonBatchServiceImpl implements CottonBatchService {


    private static final Logger log = Logger
            .getLogger(CottonBatchServiceImpl.class);// 日志文件

    @Autowired
    CottonBatchMapper cottonBatchMapper;


    public PageInfo<CottonBatch>  getCottonBatchByPage(Integer pageNo,Integer pageSize){

        CottonBatchExample cottonBatchExample=new CottonBatchExample();

        List<CottonBatch> cottonBatchList=cottonBatchMapper.selectByExample(cottonBatchExample);

        List retBatchList=PageUtils.getPageList(cottonBatchList,pageNo,pageSize);
        PageInfo<CottonBatch> pageInfo=new PageInfo<>(pageNo,pageSize);
        pageInfo.setResult(retBatchList);
        pageInfo.setTotalItems(cottonBatchList.size());
        return pageInfo;

    }






}
