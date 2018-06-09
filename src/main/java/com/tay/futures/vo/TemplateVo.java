package com.tay.futures.vo;

import java.util.List;

public class TemplateVo {
    private String name;
    private List<RangeStrategyVo> rangeStrategyVoList;
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<RangeStrategyVo> getRangeStrategyVoList() {
        return rangeStrategyVoList;
    }

    public void setRangeStrategyVoList(List<RangeStrategyVo> rangeStrategyVoList) {
        this.rangeStrategyVoList = rangeStrategyVoList;
    }


    @Override
    public String toString() {
        return "TemplateVo{" +
                "name='" + name + '\'' +
                ", rangeStrategyVoList=" + rangeStrategyVoList +
                ", id=" + id +
                '}';
    }
}
