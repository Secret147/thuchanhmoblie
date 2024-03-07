package com.example.recycleviewdemo_crud.model;

public class Cat {
    private int img;
    private String name,describe;
    private double price;

    public Cat() {
    }

    public Cat(int img, String name, String describe, double price) {
        this.img = img;
        this.name = name;
        this.describe = describe;
        this.price = price;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
