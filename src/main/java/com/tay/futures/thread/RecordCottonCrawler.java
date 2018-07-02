package com.tay.futures.thread;

import com.tay.futures.service.CottonCrawlerService;
import com.tay.futures.util.SpringContainerHolder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class RecordCottonCrawler implements Runnable{


    private static final Logger logger = LoggerFactory.getLogger(RecordCottonCrawler.class);

    private List<Long> productionCodeList;

    public CottonCrawlerService getCottonCrawlerService() {
        return SpringContainerHolder.getBean("cottonCrawlerService", CottonCrawlerService.class);
    }

    public RecordCottonCrawler() {

    }

    public RecordCottonCrawler(List<Long> productionCodeList) {
          this.productionCodeList=productionCodeList;
    }



    @Override
    public void run() {
        logger.info("record productionCode not exist in db size:{}",productionCodeList.size());
        getCottonCrawlerService().addBatchCottonCrawler(productionCodeList);
    }
}
