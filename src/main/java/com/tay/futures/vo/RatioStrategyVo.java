package com.tay.futures.vo;

import java.io.Serializable;
import java.util.Date;

public class RatioStrategyVo implements Serializable {
    private Long id;

    private Long templateId;

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

    private Date createDate;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getTemplateId() {
        return templateId;
    }

    public void setTemplateId(Long templateId) {
        this.templateId = templateId;
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

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", templateId=").append(templateId);
        sb.append(", colourW1=").append(colourW1);
        sb.append(", colourW2=").append(colourW2);
        sb.append(", colourW3=").append(colourW3);
        sb.append(", colourW4=").append(colourW4);
        sb.append(", colourW5=").append(colourW5);
        sb.append(", colourL1=").append(colourL1);
        sb.append(", colourL2=").append(colourL2);
        sb.append(", colourL3=").append(colourL3);
        sb.append(", colourLy1=").append(colourLy1);
        sb.append(", colourLy2=").append(colourLy2);
        sb.append(", colourLy3=").append(colourLy3);
        sb.append(", colourY1=").append(colourY1);
        sb.append(", colourY2=").append(colourY2);
        sb.append(", ginningP1=").append(ginningP1);
        sb.append(", ginningP2=").append(ginningP2);
        sb.append(", ginningP3=").append(ginningP3);
        sb.append(", createDate=").append(createDate);
        sb.append("]");
        return sb.toString();
    }
}