package com.tay.futures.constants;

import java.util.ArrayList;
import java.util.List;

public enum CottonPattern {

    PRODUCTION_CODE("productionCode","批号"),
    COLOUR_W1("colourW1","白棉1"),
    COLOUR_W2("colourW2","白棉2"),
    COLOUR_W3("colourW3","白棉3"),
    COLOUR_W4("colourW4","白棉4"),
    COLOUR_W5("colourW5","白棉5"),
    COLOUR_L1("colourL1","淡棉1"),
    COLOUR_L2("colourL2","淡棉2"),
    COLOUR_L3("colourL3","淡棉3"),
    COLOUR_Ly1("colourLy1","淡黄1"),
    COLOUR_Ly2("colourLy2","淡黄2"),
    COLOUR_Ly3("colourLy3","淡黄3"),
    COLOUR_Y1("colourY1","黄棉1"),
    COLOUR_Y2("colourY2","黄棉2"),
    GINNING_P1("ginningP1","轧工P1"),
    GINNING_P2("ginningP2","轧工P2"),
    GINNING_P3("ginningP3","轧工P3"),
    AVG_LENGTH("avgLength","平均长度"),
    AVG_MICRONAIRE("avgMicronaire","马克龙值"),
    AVG_EVENNESS("avgEvenness","平均长整"),
    STRENGTH("strength","强度"),
    PRICE("price","价格");


    private String field;
    private String headerName;

    private CottonPattern(String field, String headerName){
        this.field=field;
        this.headerName =headerName;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public String getHeaderName() {
        return headerName;
    }

    public void setHeaderName(String headerName) {
        this.headerName = headerName;
    }



    public static List<String> getFields(){
        CottonPattern[] cottonPatterns=   values();
        List<String> fields=new ArrayList<>();
        for(CottonPattern cottonPattern: cottonPatterns){
            fields.add(cottonPattern.field);
        }
        return fields;
    }


    public static List<String> getHeaderNames(){
        CottonPattern[] cottonPatterns=   values();
        List<String> fields=new ArrayList<>();
        for(CottonPattern cottonPattern: cottonPatterns){
            fields.add(cottonPattern.headerName);
        }
        return fields;
    }

    public static List<String> getHeaderNamesExcludePrice(){
        CottonPattern[] cottonPatterns=   values();
        List<String> fields=new ArrayList<>();
        for(CottonPattern cottonPattern: cottonPatterns){
            if(!cottonPattern.equals(CottonPattern.PRICE)){
                fields.add(cottonPattern.headerName);
            }
        }
        return fields;
    }

}
