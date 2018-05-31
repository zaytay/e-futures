package com.tay.futures.util;

import java.util.HashMap;
import java.util.Map;

public class PriceUtil {



    //bind bean properties todo modify
    public static Map<String,Double> colourPriceMap=new HashMap<String,Double>(){
        {
            put("colourW1",16d);
            put("colourW2",350d);
            put("colourW3",350d);
            put("colourW4",350d);
            put("colourW5",350d);
            put("colourL1",350d);
            put("colourL2",350d);
            put("colourL3",350d);
            put("colourLy1",350d);
            put("colourLy2",350d);
            put("colourLy3",350d);
            put("colourY1",350d);
            put("colourY2",350d);
        }
    };


    public static Map<String,Double> ginningMap=new HashMap<String,Double>(){
        {
            put("ginningP1",10d);
            put("ginningP2",200d);
            put("ginningP3",100d);
        }
    };

    public static Double computeColourLevelPrice(Map<String,Object>  beanMap, Double price){
        for(Map.Entry<String,Double> entry:colourPriceMap.entrySet()){
              price+=(Double)beanMap.get(entry.getKey()) *  entry.getValue();
        }
        return price;
    }


    public static Double computeGinningQualityPrice(Map<String,Object>  beanMap,Double price){
        for(Map.Entry<String,Double> entry:ginningMap.entrySet()){
            price+=(Double)beanMap.get(entry.getKey()) *  entry.getValue();
        }
        return price;
    }


}
