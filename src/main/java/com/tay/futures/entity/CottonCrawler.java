package com.tay.futures.entity;

import java.io.Serializable;

public class CottonCrawler implements Serializable {
    private Long id;

    private Long productionCode;

    private Integer source;

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

    public Integer getSource() {
        return source;
    }

    public void setSource(Integer source) {
        this.source = source;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", productionCode=").append(productionCode);
        sb.append(", source=").append(source);
        sb.append("]");
        return sb.toString();
    }
}