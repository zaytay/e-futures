package com.tay.futures.dao;

import com.tay.futures.entity.RatioStrategy;
import com.tay.futures.entity.RatioStrategyExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RatioStrategyMapper {
    int countByExample(RatioStrategyExample example);

    int deleteByExample(RatioStrategyExample example);

    int deleteByPrimaryKey(Long id);

    int insert(RatioStrategy record);

    int insertSelective(RatioStrategy record);

    List<RatioStrategy> selectByExample(RatioStrategyExample example);

    RatioStrategy selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") RatioStrategy record, @Param("example") RatioStrategyExample example);

    int updateByExample(@Param("record") RatioStrategy record, @Param("example") RatioStrategyExample example);

    int updateByPrimaryKeySelective(RatioStrategy record);

    int updateByPrimaryKey(RatioStrategy record);
}