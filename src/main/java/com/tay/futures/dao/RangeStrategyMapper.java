package com.tay.futures.dao;

import com.tay.futures.entity.RangeStrategy;
import com.tay.futures.entity.RangeStrategyExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RangeStrategyMapper {
    int countByExample(RangeStrategyExample example);

    int deleteByExample(RangeStrategyExample example);

    int deleteByPrimaryKey(Long id);

    int insert(RangeStrategy record);

    int insertSelective(RangeStrategy record);

    List<RangeStrategy> selectByExample(RangeStrategyExample example);

    RangeStrategy selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") RangeStrategy record, @Param("example") RangeStrategyExample example);

    int updateByExample(@Param("record") RangeStrategy record, @Param("example") RangeStrategyExample example);

    int updateByPrimaryKeySelective(RangeStrategy record);

    int updateByPrimaryKey(RangeStrategy record);
}