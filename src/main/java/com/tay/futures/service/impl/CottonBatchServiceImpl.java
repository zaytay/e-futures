package com.tay.futures.service.impl;

import com.google.common.collect.Lists;
import com.tay.futures.dao.CottonBatchMapper;
import com.tay.futures.entity.CottonBatch;
import com.tay.futures.entity.CottonBatchExample;
import com.tay.futures.service.CottonBatchService;
import com.tay.futures.util.PageInfo;
import com.tay.futures.util.PageUtils;
import org.apache.commons.collections.CollectionUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service("cottonBatchService")
public class CottonBatchServiceImpl implements CottonBatchService {

    public static final Integer BATCH_SIZE=500;

    private static final Logger log = Logger
            .getLogger(CottonBatchServiceImpl.class);// 日志文件

    @Autowired
    private CottonBatchMapper cottonBatchMapper;


    public PageInfo<CottonBatch>  getCottonBatchByPage(Integer pageNo,Integer pageSize){

        CottonBatchExample cottonBatchExample=new CottonBatchExample();

        List<CottonBatch> cottonBatchList=cottonBatchMapper.selectByExample(cottonBatchExample);

        List retBatchList=PageUtils.getPageList(cottonBatchList,pageNo,pageSize);
        PageInfo<CottonBatch> pageInfo=new PageInfo<>(pageNo,pageSize);
        pageInfo.setResult(retBatchList);
        pageInfo.setTotalItems(cottonBatchList.size());
        return pageInfo;

    }

    @Override
    public List<CottonBatch> getAllCottonBatch() {
        CottonBatchExample cottonBatchExample=new CottonBatchExample();
        return cottonBatchMapper.selectByExample(cottonBatchExample);
    }


    public CottonBatch getCottonBatchByCode(Long code){
        CottonBatchExample cottonBatchExample=new CottonBatchExample();
        cottonBatchExample.createCriteria().andProductionCodeEqualTo(code);
        List<CottonBatch> cottonBatches=cottonBatchMapper.selectByExample(cottonBatchExample);
        if(CollectionUtils.isNotEmpty(cottonBatches)){
            return cottonBatches.get(0);
        }else {
            return null;
        }
    }


    public List<CottonBatch> getCottonBatchListByCodes(List<Long> codeList){
        CottonBatchExample cottonBatchExample=new CottonBatchExample();
        List<List<Long>> codesList = Lists.partition(codeList,BATCH_SIZE);
        List<CottonBatch> cottonBatchList=new ArrayList<>();

        for(List<Long> codes : codesList){
            cottonBatchExample.createCriteria().andProductionCodeIn(codes);
            List<CottonBatch> cottonBatches=cottonBatchMapper.selectByExample(cottonBatchExample);
            cottonBatchExample.clear();
            cottonBatchList.addAll(cottonBatches);
        }
        return  cottonBatchList;
    }



    public void deleteAllCottonBaches(){
        CottonBatchExample cottonBatchExample=new CottonBatchExample();
        cottonBatchMapper.deleteByExample(cottonBatchExample);
    }
}
