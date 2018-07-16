package com.tay.futures.dao;

import com.tay.futures.entity.CottonBatch;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CottonBatchSupportMapper {
    public List<CottonBatch> selectByCodes(@Param("codeList") List<Long> codeList);


}
