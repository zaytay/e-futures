package com.tay.futures.constants;

public enum ColourLevelPrice {
    W1("白棉1",350),
    W2("白棉2",300),
    W3("白棉3",200),
    W4("白棉4",100),
    W5("白棉5",50),
    L1("淡点污棉1",0),
    L2("淡点污2",-10),
    L3("淡点污棉3",-50),
    LY1("淡黄染1",-30),
    LY2("淡黄染2",-100),
    LY3("淡黄染3",-10),
    Y1("黄染棉1",-10),
    Y2("黄染棉2",-10);



    private String memo;
    private Integer price;

    private ColourLevelPrice(String memo,Integer price){
        this.memo=memo;
        this.price=price;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }



}
