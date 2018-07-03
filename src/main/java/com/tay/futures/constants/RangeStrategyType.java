package com.tay.futures.constants;

public enum RangeStrategyType {


    //todo modify attributeName bind cottonBatch  entity
    LENGTH(1,"avgLength"),
    MICRONAIRE(2,"avgMicronaire"),
    EVENNESS(3,"avgEvenness"),
    STRENGTH(4,"strength"),
    MISCELLANEOUS(5,"miscellaneous"),
    HUICHAO(6,"huichao");


    private Integer code;
    private String attributeName;

    RangeStrategyType(Integer code,String attributeName) {
        this.code = code;
        this.attributeName=attributeName;
    }

    public Integer getCode() {
        return code;
    }

    public String getAttributeName() {
        return attributeName;
    }

    public void setAttributeName(String attributeName) {
        this.attributeName = attributeName;
    }

    public static  RangeStrategyType valueOf(Integer code) {
        for (RangeStrategyType type : RangeStrategyType.values()) {
            if (code == type.getCode())
                return type;
        }
        return null;
    }



}
