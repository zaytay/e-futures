package com.tay.futures.service;

import java.util.List;

public interface CottonCrawlerService {

    public void addCottonCrawler(Long productionCode);

    public void addBatchCottonCrawler(List<Long> productionCodeList);


}
