import com.fasterxml.jackson.databind.ObjectMapper;
import com.tay.futures.entity.CottonBatch;

import java.util.Map;

public class Test {

    @org.junit.Test
    public void testFun(){
        CottonBatch cottonBatch=new CottonBatch();
        cottonBatch.setColourW1(10.0);
        cottonBatch.setColourW2(11.0);

        ObjectMapper m = new ObjectMapper();
        Map<String,Object> props = m.convertValue(cottonBatch, Map.class);
        System.out.println(props);
    }


}
