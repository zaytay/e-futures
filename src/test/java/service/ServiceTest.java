package service;

import com.tay.futures.entity.CottonBatch;
import com.tay.futures.service.CottonBatchService;
import com.tay.futures.util.PageInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class) //指定测试用例的运行器 这里是指定了Junit4
@ContextConfiguration("classpath:spring-context.xml")
public class ServiceTest {
    @Autowired
    private CottonBatchService cottonBatchService;


    @Test
    public  void testGetBatch(){
        PageInfo<CottonBatch> batches=cottonBatchService.getCottonBatchByPage(1,10);
        return;
    }


}
