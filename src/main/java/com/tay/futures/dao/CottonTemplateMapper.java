package com.tay.futures.dao;

import com.tay.futures.entity.CottonTemplate;
import com.tay.futures.entity.CottonTemplateExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CottonTemplateMapper {
    int countByExample(CottonTemplateExample example);

    int deleteByExample(CottonTemplateExample example);

    int deleteByPrimaryKey(Long id);

    int insert(CottonTemplate record);

    int insertSelective(CottonTemplate record);

    List<CottonTemplate> selectByExample(CottonTemplateExample example);

    CottonTemplate selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") CottonTemplate record, @Param("example") CottonTemplateExample example);

    int updateByExample(@Param("record") CottonTemplate record, @Param("example") CottonTemplateExample example);

    int updateByPrimaryKeySelective(CottonTemplate record);

    int updateByPrimaryKey(CottonTemplate record);
}