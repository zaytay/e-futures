package com.tay.futures.service.impl;

import com.tay.futures.dao.CottonCrawlerMapper;
import com.tay.futures.entity.CottonCrawler;
import com.tay.futures.entity.CottonCrawlerExample;
import com.tay.futures.service.CottonCrawlerService;
import org.apache.commons.collections.CollectionUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service(value = "cottonCrawlerService")
public class CottonCrawlerServiceImpl implements CottonCrawlerService{

    private static final Logger logger = LoggerFactory.getLogger(CottonCrawlerServiceImpl.class);


    @Resource
    private CottonCrawlerMapper cottonCrawlerMapper;


    public void addCottonCrawler(Long productionCode){
        CottonCrawlerExample cottonCrawlerExample=new CottonCrawlerExample();
        cottonCrawlerExample.createCriteria().andProductionCodeEqualTo(productionCode);
        List<CottonCrawler> cottonCrawlers= cottonCrawlerMapper.selectByExample(cottonCrawlerExample);
        if(CollectionUtils.isNotEmpty(cottonCrawlers)){
            logger.error("productionCode:{}  has store in crawler");
        }else {
            CottonCrawler cottonCrawler=new CottonCrawler();
            cottonCrawler.setProductionCode(productionCode);
            cottonCrawlerMapper.insertSelective(cottonCrawler);
        }
    }


    public void addBatchCottonCrawler(List<Long> productionCodeList){
        CottonCrawlerExample cottonCrawlerExample=new CottonCrawlerExample();
        cottonCrawlerExample.createCriteria().andProductionCodeIn(productionCodeList);
        List<CottonCrawler> cottonCrawlers= cottonCrawlerMapper.selectByExample(cottonCrawlerExample);
        Set<Long> productionCodeInDb=new HashSet<>();
        for(CottonCrawler cottonCrawler:cottonCrawlers){
            productionCodeInDb.add(cottonCrawler.getProductionCode());
        }
        Set<Long> allProductionCodeList=new HashSet<>(productionCodeList);
        allProductionCodeList.removeAll(productionCodeInDb);
        for(Long productionCode: allProductionCodeList){
            addCottonCrawler(productionCode);
        }
    }







}
