package service;

import com.google.common.collect.Lists;
import com.tay.futures.constants.RangeStrategyType;
import com.tay.futures.entity.CottonBatch;
import com.tay.futures.entity.CottonTemplate;
import com.tay.futures.entity.RangeStrategy;
import com.tay.futures.entity.RatioStrategy;
import com.tay.futures.service.CottonBatchService;
import com.tay.futures.service.CottonPriceService;
import com.tay.futures.service.CottonTemplateService;
import com.tay.futures.util.PageInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class) //指定测试用例的运行器 这里是指定了Junit4
@ContextConfiguration("classpath:spring-context.xml")
public class ServiceTest {
    @Autowired
    private CottonBatchService cottonBatchService;

    @Autowired
    private CottonTemplateService cottonTemplateService;

    @Autowired
    private CottonPriceService cottonPriceService;


    @Test
    public  void testGetBatch(){
        PageInfo<CottonBatch> batches=cottonBatchService.getCottonBatchByPage(1,10);
        return;
    }


    @Test
    public void deleteBatch(){
        cottonBatchService.deleteAllCottonBaches();
    }


    @Test
    public void addTemplate(){
        CottonTemplate cottonTemplate=new CottonTemplate();
        cottonTemplate.setCreatorId(2L);
        cottonTemplate.setName("测试计算模板1");
        List<RangeStrategy> testRangList=new ArrayList<>();
        for(RangeStrategyType rangeStrategyType:RangeStrategyType.values()){
            RangeStrategy rangeStrategy=new RangeStrategy();
            rangeStrategy.setMin(1d);
            rangeStrategy.setMax(20d);
            rangeStrategy.setPrice(1d);
            rangeStrategy.setType(rangeStrategyType.getCode().byteValue());
            testRangList.add(rangeStrategy);
        }
        RatioStrategy ratioStrategy=new RatioStrategy();
        cottonTemplateService.addTemplateAndStrategy(cottonTemplate,ratioStrategy,testRangList);
    }


    @Test
    public void computePrice() throws Exception {
        Double price=cottonPriceService.computePrice(65001171040L,4L);
        System.out.println(price);
    }

    @Test
    public void testBatchGetCottonBatches(){
        List<Long> codes= Lists.newArrayList(12345L,123L,23456L);
        List<CottonBatch> cottonBatchList =cottonBatchService.getCottonBatchListByCodes(codes);
        System.out.println(cottonBatchList);
    }



}
