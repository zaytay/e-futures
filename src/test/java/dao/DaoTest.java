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
        for(int i=0;i<30;i++){
            CottonBatch record=new CottonBatch();
            record.setProductionCode(12343124L);
            record.setType("测试类别");
            record.setCount(168);
            record.setProductionArea("测试场地");
            record.setPrice("11");
            record.setWarehouse("仓库");
            record.setWeight(14);
            record.setColourLevel("颜色");
            record.setAvgLength(11);
            record.setStrength(80);
            record.setAvgMicronaire(66);
            record.setMoisture(5434);
            record.setMiscellaneous(343433);
            record.setAvgEvenness(434);
            record.setGinningQuality("P2");
            record.setWeightNumber("13243434343");
            record.setStandard("biaozhun");
            record.setGrossWeight(3434);
            cottonBatchMapper.insertSelective(record);
        }

        return;
    }




}
