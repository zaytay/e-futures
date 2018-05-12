package com.tay.futures.dao;

import com.tay.futures.entity.CottonBatch;
import com.tay.futures.entity.CottonBatchExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CottonBatchMapper {
    int countByExample(CottonBatchExample example);

    int deleteByExample(CottonBatchExample example);

    int deleteByPrimaryKey(Long id);

    int insert(CottonBatch record);

    int insertSelective(CottonBatch record);

    List<CottonBatch> selectByExample(CottonBatchExample example);

    CottonBatch selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") CottonBatch record, @Param("example") CottonBatchExample example);

    int updateByExample(@Param("record") CottonBatch record, @Param("example") CottonBatchExample example);

    int updateByPrimaryKeySelective(CottonBatch record);

    int updateByPrimaryKey(CottonBatch record);
}