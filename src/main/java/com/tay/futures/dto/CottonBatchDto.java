package com.tay.futures.dto;

import java.io.Serializable;

public class CottonBatchDto implements Serializable{

    private static final long serialVersionUID = 2L;


    private Long id;

    private Long productionCode;

    private Double colourW1;

    private Double colourW2;

    private Double colourW3;

    private Double colourW4;

    private Double colourW5;

    private Double colourL1;

    private Double colourL2;

    private Double colourL3;

    private Double colourLy1;

    private Double colourLy2;

    private Double colourLy3;

    private Double colourY1;

    private Double colourY2;

    private Double ginningP1;

    private Double ginningP2;

    private Double ginningP3;

    private Double avgLength;

    private Double avgMicronaire;

    private Double avgEvenness;

    private Double strength;

    private Double miscellaneous;

    private String factory;

    private String productionArea;

    private String warehouse;

    private String remark;

    private Double price;



    private Double length32;

    private Double length31;

    private Double length30;

    private Double length29;

    private Double length28;

    private Double length27;

    private Double length26;

    private Double length25;

    private Double micronaireC1;

    private Double micronaireB1;

    private Double micronaireA;

    private Double micronaireB2;

    private Double micronaireC2;

    private Double huichao;

    private Double strengthMax;

    private Double strengthMin;

    private Double evennessMax;

    private Double evennessMin;

    private Double weightGross;

    private Double weightTare;

    private Double weightNet;

    private Double weightConditoned;

    private String jiagongleixing;

    private String packageNum;

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getProductionCode() {
        return productionCode;
    }

    public void setProductionCode(Long productionCode) {
        this.productionCode = productionCode;
    }

    public Double getColourW1() {
        return colourW1;
    }

    public void setColourW1(Double colourW1) {
        this.colourW1 = colourW1;
    }

    public Double getColourW2() {
        return colourW2;
    }

    public void setColourW2(Double colourW2) {
        this.colourW2 = colourW2;
    }

    public Double getColourW3() {
        return colourW3;
    }

    public void setColourW3(Double colourW3) {
        this.colourW3 = colourW3;
    }

    public Double getColourW4() {
        return colourW4;
    }

    public void setColourW4(Double colourW4) {
        this.colourW4 = colourW4;
    }

    public Double getColourW5() {
        return colourW5;
    }

    public void setColourW5(Double colourW5) {
        this.colourW5 = colourW5;
    }

    public Double getColourL1() {
        return colourL1;
    }

    public void setColourL1(Double colourL1) {
        this.colourL1 = colourL1;
    }

    public Double getColourL2() {
        return colourL2;
    }

    public void setColourL2(Double colourL2) {
        this.colourL2 = colourL2;
    }

    public Double getColourL3() {
        return colourL3;
    }

    public void setColourL3(Double colourL3) {
        this.colourL3 = colourL3;
    }

    public Double getColourLy1() {
        return colourLy1;
    }

    public void setColourLy1(Double colourLy1) {
        this.colourLy1 = colourLy1;
    }

    public Double getColourLy2() {
        return colourLy2;
    }

    public void setColourLy2(Double colourLy2) {
        this.colourLy2 = colourLy2;
    }

    public Double getColourLy3() {
        return colourLy3;
    }

    public void setColourLy3(Double colourLy3) {
        this.colourLy3 = colourLy3;
    }

    public Double getColourY1() {
        return colourY1;
    }

    public void setColourY1(Double colourY1) {
        this.colourY1 = colourY1;
    }

    public Double getColourY2() {
        return colourY2;
    }

    public void setColourY2(Double colourY2) {
        this.colourY2 = colourY2;
    }

    public Double getGinningP1() {
        return ginningP1;
    }

    public void setGinningP1(Double ginningP1) {
        this.ginningP1 = ginningP1;
    }

    public Double getGinningP2() {
        return ginningP2;
    }

    public void setGinningP2(Double ginningP2) {
        this.ginningP2 = ginningP2;
    }

    public Double getGinningP3() {
        return ginningP3;
    }

    public void setGinningP3(Double ginningP3) {
        this.ginningP3 = ginningP3;
    }

    public Double getAvgLength() {
        return avgLength;
    }

    public void setAvgLength(Double avgLength) {
        this.avgLength = avgLength;
    }

    public Double getAvgMicronaire() {
        return avgMicronaire;
    }

    public void setAvgMicronaire(Double avgMicronaire) {
        this.avgMicronaire = avgMicronaire;
    }

    public Double getAvgEvenness() {
        return avgEvenness;
    }

    public void setAvgEvenness(Double avgEvenness) {
        this.avgEvenness = avgEvenness;
    }

    public Double getStrength() {
        return strength;
    }

    public void setStrength(Double strength) {
        this.strength = strength;
    }

    public Double getMiscellaneous() {
        return miscellaneous;
    }

    public void setMiscellaneous(Double miscellaneous) {
        this.miscellaneous = miscellaneous;
    }

    public String getFactory() {
        return factory;
    }

    public void setFactory(String factory) {
        this.factory = factory == null ? null : factory.trim();
    }

    public String getProductionArea() {
        return productionArea;
    }

    public void setProductionArea(String productionArea) {
        this.productionArea = productionArea == null ? null : productionArea.trim();
    }

    public String getWarehouse() {
        return warehouse;
    }

    public void setWarehouse(String warehouse) {
        this.warehouse = warehouse == null ? null : warehouse.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Double getLength32() {
        return length32;
    }

    public void setLength32(Double length32) {
        this.length32 = length32;
    }

    public Double getLength31() {
        return length31;
    }

    public void setLength31(Double length31) {
        this.length31 = length31;
    }

    public Double getLength30() {
        return length30;
    }

    public void setLength30(Double length30) {
        this.length30 = length30;
    }

    public Double getLength29() {
        return length29;
    }

    public void setLength29(Double length29) {
        this.length29 = length29;
    }

    public Double getLength28() {
        return length28;
    }

    public void setLength28(Double length28) {
        this.length28 = length28;
    }

    public Double getLength27() {
        return length27;
    }

    public void setLength27(Double length27) {
        this.length27 = length27;
    }

    public Double getLength26() {
        return length26;
    }

    public void setLength26(Double length26) {
        this.length26 = length26;
    }

    public Double getLength25() {
        return length25;
    }

    public void setLength25(Double length25) {
        this.length25 = length25;
    }

    public Double getMicronaireC1() {
        return micronaireC1;
    }

    public void setMicronaireC1(Double micronaireC1) {
        this.micronaireC1 = micronaireC1;
    }

    public Double getMicronaireB1() {
        return micronaireB1;
    }

    public void setMicronaireB1(Double micronaireB1) {
        this.micronaireB1 = micronaireB1;
    }

    public Double getMicronaireA() {
        return micronaireA;
    }

    public void setMicronaireA(Double micronaireA) {
        this.micronaireA = micronaireA;
    }

    public Double getMicronaireB2() {
        return micronaireB2;
    }

    public void setMicronaireB2(Double micronaireB2) {
        this.micronaireB2 = micronaireB2;
    }

    public Double getMicronaireC2() {
        return micronaireC2;
    }

    public void setMicronaireC2(Double micronaireC2) {
        this.micronaireC2 = micronaireC2;
    }

    public Double getHuichao() {
        return huichao;
    }

    public void setHuichao(Double huichao) {
        this.huichao = huichao;
    }

    public Double getStrengthMax() {
        return strengthMax;
    }

    public void setStrengthMax(Double strengthMax) {
        this.strengthMax = strengthMax;
    }

    public Double getStrengthMin() {
        return strengthMin;
    }

    public void setStrengthMin(Double strengthMin) {
        this.strengthMin = strengthMin;
    }

    public Double getEvennessMax() {
        return evennessMax;
    }

    public void setEvennessMax(Double evennessMax) {
        this.evennessMax = evennessMax;
    }

    public Double getEvennessMin() {
        return evennessMin;
    }

    public void setEvennessMin(Double evennessMin) {
        this.evennessMin = evennessMin;
    }

    public Double getWeightGross() {
        return weightGross;
    }

    public void setWeightGross(Double weightGross) {
        this.weightGross = weightGross;
    }

    public Double getWeightTare() {
        return weightTare;
    }

    public void setWeightTare(Double weightTare) {
        this.weightTare = weightTare;
    }

    public Double getWeightNet() {
        return weightNet;
    }

    public void setWeightNet(Double weightNet) {
        this.weightNet = weightNet;
    }

    public Double getWeightConditoned() {
        return weightConditoned;
    }

    public void setWeightConditoned(Double weightConditoned) {
        this.weightConditoned = weightConditoned;
    }

    public String getJiagongleixing() {
        return jiagongleixing;
    }

    public void setJiagongleixing(String jiagongleixing) {
        this.jiagongleixing = jiagongleixing;
    }

    public String getPackageNum() {
        return packageNum;
    }

    public void setPackageNum(String packageNum) {
        this.packageNum = packageNum;
    }

    @Override
    public String toString() {
        return "CottonBatchDto{" +
                "id=" + id +
                ", productionCode=" + productionCode +
                ", colourW1=" + colourW1 +
                ", colourW2=" + colourW2 +
                ", colourW3=" + colourW3 +
                ", colourW4=" + colourW4 +
                ", colourW5=" + colourW5 +
                ", colourL1=" + colourL1 +
                ", colourL2=" + colourL2 +
                ", colourL3=" + colourL3 +
                ", colourLy1=" + colourLy1 +
                ", colourLy2=" + colourLy2 +
                ", colourLy3=" + colourLy3 +
                ", colourY1=" + colourY1 +
                ", colourY2=" + colourY2 +
                ", ginningP1=" + ginningP1 +
                ", ginningP2=" + ginningP2 +
                ", ginningP3=" + ginningP3 +
                ", avgLength=" + avgLength +
                ", avgMicronaire=" + avgMicronaire +
                ", avgEvenness=" + avgEvenness +
                ", strength=" + strength +
                ", miscellaneous=" + miscellaneous +
                ", factory='" + factory + '\'' +
                ", productionArea='" + productionArea + '\'' +
                ", warehouse='" + warehouse + '\'' +
                ", remark='" + remark + '\'' +
                ", price=" + price +
                ", length32=" + length32 +
                ", length31=" + length31 +
                ", length30=" + length30 +
                ", length29=" + length29 +
                ", length28=" + length28 +
                ", length27=" + length27 +
                ", length26=" + length26 +
                ", length25=" + length25 +
                ", micronaireC1=" + micronaireC1 +
                ", micronaireB1=" + micronaireB1 +
                ", micronaireA=" + micronaireA +
                ", micronaireB2=" + micronaireB2 +
                ", micronaireC2=" + micronaireC2 +
                ", huichao=" + huichao +
                ", strengthMax=" + strengthMax +
                ", strengthMin=" + strengthMin +
                ", evennessMax=" + evennessMax +
                ", evennessMin=" + evennessMin +
                ", weightGross=" + weightGross +
                ", weightTare=" + weightTare +
                ", weightNet=" + weightNet +
                ", weightConditoned=" + weightConditoned +
                ", jiagongleixing='" + jiagongleixing + '\'' +
                ", packageNum='" + packageNum + '\'' +
                '}';
    }
}
