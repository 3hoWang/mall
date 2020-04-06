package com.zhenyiwang.mall.bean.admin;

import java.util.List;

public class Goods {
    private Integer id;

    private String img;

    private String name;

    private String desc;

    private Double price;

    private Integer typeId;

    private Integer stockNum;

    private List<Spec> specList;
    //"id": 534,
    //			"img": "http://115.29.141.32:8084/static/image/1585744787830timg (1).jpg",
    //			"name": "球鞋",
    //			"desc": "black_red",
    //			"typeId": 190,
    //			"unitPrice": 0.0

    public List<Spec> getSpecList() {
        return specList;
    }

    public void setSpecList(List<Spec> specList) {
        this.specList = specList;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public Integer getStockNum() {
        return stockNum;
    }

    public void setStockNum(Integer stockNum) {
        this.stockNum = stockNum;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "id=" + id +
                ", img='" + img + '\'' +
                ", name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                ", price=" + price +
                ", typeId=" + typeId +
                ", stockNum=" + stockNum +
                '}';
    }
}