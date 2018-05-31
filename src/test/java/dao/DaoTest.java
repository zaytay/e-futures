package dao;

import com.tay.futures.dao.CottonBatchMapper;
import com.tay.futures.entity.CottonBatch;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class) //指定测试用例的运行器 这里是指定了Junit4
@ContextConfiguration("classpath:spring-context.xml")
public class DaoTest {

    @Autowired
    private CottonBatchMapper cottonBatchMapper;

    @Test
    public void insertCottonBatch() {
        for(int i=0;i<1;i++){
            CottonBatch record=new CottonBatch();
            record.setProductionCode(123456L);
            record.setProductionArea("测试场地");
            record.setWarehouse("仓库");
            record.setColourW1(100.0);
            record.setGinningP1(100.0);

            record.setAvgLength(10d);
            record.setStrength(10d);
            record.setAvgMicronaire(10d);
            record.setMiscellaneous(10d);
            record.setAvgEvenness(10d);
            cottonBatchMapper.insertSelective(record);
        }

        return;
    }




}
