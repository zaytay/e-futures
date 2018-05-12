package com.tay.futures.entity;

import java.io.Serializable;

public class CottonBatch implements Serializable {
    private Long id;

    private Long productionCode;

    private String type;

    private String productionArea;

    private Integer count;

    private String price;

    private Integer weight;

    private String colourLevel;

    private Integer avgLength;

    private Integer strength;

    private Integer avgMicronaire;

    private Integer moisture;

    private Integer miscellaneous;

    private Integer avgEvenness;

    private String ginningQuality;

    private String warehouse;

    private String weightNumber;

    private String standard;

    private Integer grossWeight;

    private Integer netWeight;

    private Integer tareWeight;

    private String qualityNumber;

    private Integer coreLength;

    private String coreMicronaire;

    private Integer maxEvenness;

    private Integer minEvenness;

    private String remark;

    private static final long serialVersionUID = 1L;

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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getProductionArea() {
        return productionArea;
    }

    public void setProductionArea(String productionArea) {
        this.productionArea = productionArea == null ? null : productionArea.trim();
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price == null ? null : price.trim();
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public String getColourLevel() {
        return colourLevel;
    }

    public void setColourLevel(String colourLevel) {
        this.colourLevel = colourLevel == null ? null : colourLevel.trim();
    }

    public Integer getAvgLength() {
        return avgLength;
    }

    public void setAvgLength(Integer avgLength) {
        this.avgLength = avgLength;
    }

    public Integer getStrength() {
        return strength;
    }

    public void setStrength(Integer strength) {
        this.strength = strength;
    }

    public Integer getAvgMicronaire() {
        return avgMicronaire;
    }

    public void setAvgMicronaire(Integer avgMicronaire) {
        this.avgMicronaire = avgMicronaire;
    }

    public Integer getMoisture() {
        return moisture;
    }

    public void setMoisture(Integer moisture) {
        this.moisture = moisture;
    }

    public Integer getMiscellaneous() {
        return miscellaneous;
    }

    public void setMiscellaneous(Integer miscellaneous) {
        this.miscellaneous = miscellaneous;
    }

    public Integer getAvgEvenness() {
        return avgEvenness;
    }

    public void setAvgEvenness(Integer avgEvenness) {
        this.avgEvenness = avgEvenness;
    }

    public String getGinningQuality() {
        return ginningQuality;
    }

    public void setGinningQuality(String ginningQuality) {
        this.ginningQuality = ginningQuality == null ? null : ginningQuality.trim();
    }

    public String getWarehouse() {
        return warehouse;
    }

    public void setWarehouse(String warehouse) {
        this.warehouse = warehouse == null ? null : warehouse.trim();
    }

    public String getWeightNumber() {
        return weightNumber;
    }

    public void setWeightNumber(String weightNumber) {
        this.weightNumber = weightNumber == null ? null : weightNumber.trim();
    }

    public String getStandard() {
        return standard;
    }

    public void setStandard(String standard) {
        this.standard = standard == null ? null : standard.trim();
    }

    public Integer getGrossWeight() {
        return grossWeight;
    }

    public void setGrossWeight(Integer grossWeight) {
        this.grossWeight = grossWeight;
    }

    public Integer getNetWeight() {
        return netWeight;
    }

    public void setNetWeight(Integer netWeight) {
        this.netWeight = netWeight;
    }

    public Integer getTareWeight() {
        return tareWeight;
    }

    public void setTareWeight(Integer tareWeight) {
        this.tareWeight = tareWeight;
    }

    public String getQualityNumber() {
        return qualityNumber;
    }

    public void setQualityNumber(String qualityNumber) {
        this.qualityNumber = qualityNumber == null ? null : qualityNumber.trim();
    }

    public Integer getCoreLength() {
        return coreLength;
    }

    public void setCoreLength(Integer coreLength) {
        this.coreLength = coreLength;
    }

    public String getCoreMicronaire() {
        return coreMicronaire;
    }

    public void setCoreMicronaire(String coreMicronaire) {
        this.coreMicronaire = coreMicronaire == null ? null : coreMicronaire.trim();
    }

    public Integer getMaxEvenness() {
        return maxEvenness;
    }

    public void setMaxEvenness(Integer maxEvenness) {
        this.maxEvenness = maxEvenness;
    }

    public Integer getMinEvenness() {
        return minEvenness;
    }

    public void setMinEvenness(Integer minEvenness) {
        this.minEvenness = minEvenness;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", productionCode=").append(productionCode);
        sb.append(", type=").append(type);
        sb.append(", productionArea=").append(productionArea);
        sb.append(", count=").append(count);
        sb.append(", price=").append(price);
        sb.append(", weight=").append(weight);
        sb.append(", colourLevel=").append(colourLevel);
        sb.append(", avgLength=").append(avgLength);
        sb.append(", strength=").append(strength);
        sb.append(", avgMicronaire=").append(avgMicronaire);
        sb.append(", moisture=").append(moisture);
        sb.append(", miscellaneous=").append(miscellaneous);
        sb.append(", avgEvenness=").append(avgEvenness);
        sb.append(", ginningQuality=").append(ginningQuality);
        sb.append(", warehouse=").append(warehouse);
        sb.append(", weightNumber=").append(weightNumber);
        sb.append(", standard=").append(standard);
        sb.append(", grossWeight=").append(grossWeight);
        sb.append(", netWeight=").append(netWeight);
        sb.append(", tareWeight=").append(tareWeight);
        sb.append(", qualityNumber=").append(qualityNumber);
        sb.append(", coreLength=").append(coreLength);
        sb.append(", coreMicronaire=").append(coreMicronaire);
        sb.append(", maxEvenness=").append(maxEvenness);
        sb.append(", minEvenness=").append(minEvenness);
        sb.append(", remark=").append(remark);
        sb.append("]");
        return sb.toString();
    }
}