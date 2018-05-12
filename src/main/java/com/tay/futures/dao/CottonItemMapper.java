package com.tay.futures.dao;

import com.tay.futures.entity.CottonItem;
import com.tay.futures.entity.CottonItemExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CottonItemMapper {
    int countByExample(CottonItemExample example);

    int deleteByExample(CottonItemExample example);

    int deleteByPrimaryKey(Long id);

    int insert(CottonItem record);

    int insertSelective(CottonItem record);

    List<CottonItem> selectByExample(CottonItemExample example);

    CottonItem selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") CottonItem record, @Param("example") CottonItemExample example);

    int updateByExample(@Param("record") CottonItem record, @Param("example") CottonItemExample example);

    int updateByPrimaryKeySelective(CottonItem record);

    int updateByPrimaryKey(CottonItem record);
}