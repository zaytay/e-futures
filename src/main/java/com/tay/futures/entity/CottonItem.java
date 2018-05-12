package com.tay.futures.entity;

import java.io.Serializable;
import java.util.Date;

public class CottonItem implements Serializable {
    private Long id;

    private Long batchId;

    private Long barcod;

    private String colourLevel;

    private Integer length;

    private Integer strength;

    private Integer micronaire;

    private Integer evenness;

    private Integer ginningQuality;

    private Date createDate;

    private Integer yellowLevel;

    private Integer reflectivity;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getBatchId() {
        return batchId;
    }

    public void setBatchId(Long batchId) {
        this.batchId = batchId;
    }

    public Long getBarcod() {
        return barcod;
    }

    public void setBarcod(Long barcod) {
        this.barcod = barcod;
    }

    public String getColourLevel() {
        return colourLevel;
    }

    public void setColourLevel(String colourLevel) {
        this.colourLevel = colourLevel == null ? null : colourLevel.trim();
    }

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    public Integer getStrength() {
        return strength;
    }

    public void setStrength(Integer strength) {
        this.strength = strength;
    }

    public Integer getMicronaire() {
        return micronaire;
    }

    public void setMicronaire(Integer micronaire) {
        this.micronaire = micronaire;
    }

    public Integer getEvenness() {
        return evenness;
    }

    public void setEvenness(Integer evenness) {
        this.evenness = evenness;
    }

    public Integer getGinningQuality() {
        return ginningQuality;
    }

    public void setGinningQuality(Integer ginningQuality) {
        this.ginningQuality = ginningQuality;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Integer getYellowLevel() {
        return yellowLevel;
    }

    public void setYellowLevel(Integer yellowLevel) {
        this.yellowLevel = yellowLevel;
    }

    public Integer getReflectivity() {
        return reflectivity;
    }

    public void setReflectivity(Integer reflectivity) {
        this.reflectivity = reflectivity;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", batchId=").append(batchId);
        sb.append(", barcod=").append(barcod);
        sb.append(", colourLevel=").append(colourLevel);
        sb.append(", length=").append(length);
        sb.append(", strength=").append(strength);
        sb.append(", micronaire=").append(micronaire);
        sb.append(", evenness=").append(evenness);
        sb.append(", ginningQuality=").append(ginningQuality);
        sb.append(", createDate=").append(createDate);
        sb.append(", yellowLevel=").append(yellowLevel);
        sb.append(", reflectivity=").append(reflectivity);
        sb.append("]");
        return sb.toString();
    }
}