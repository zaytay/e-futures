package com.tay.futures.dao;

import com.tay.futures.entity.CottonCrawler;
import com.tay.futures.entity.CottonCrawlerExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CottonCrawlerMapper {
    int countByExample(CottonCrawlerExample example);

    int deleteByExample(CottonCrawlerExample example);

    int deleteByPrimaryKey(Long id);

    int insert(CottonCrawler record);

    int insertSelective(CottonCrawler record);

    List<CottonCrawler> selectByExample(CottonCrawlerExample example);

    CottonCrawler selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") CottonCrawler record, @Param("example") CottonCrawlerExample example);

    int updateByExample(@Param("record") CottonCrawler record, @Param("example") CottonCrawlerExample example);

    int updateByPrimaryKeySelective(CottonCrawler record);

    int updateByPrimaryKey(CottonCrawler record);
}