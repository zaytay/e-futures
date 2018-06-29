package com.tay.futures.service;

import com.tay.futures.dto.CottonBatchDto;
import com.tay.futures.exception.BusinessException;
import com.tay.futures.exception.ServiceException;

import java.util.List;

public interface CottonPriceService {

    public Double computePrice(Long code,Long templateId) throws Exception;


    public List<CottonBatchDto> batchComputePrice(List<CottonBatchDto> cottonBatchList, Long templateId) throws BusinessException, ServiceException;

}
