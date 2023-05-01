package com.example.springsolo.models;

public class Product {
    String name;
    String desc;
    String imgUrl;

    public Product(String name, String desc, String imgUrl) {
        this.name = name;
        this.desc = desc;
        this.imgUrl = imgUrl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }
}
