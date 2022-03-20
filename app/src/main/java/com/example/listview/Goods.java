package com.example.listview;

import java.io.Serializable;

public class Goods implements Serializable {
    private String name;
    private String txt1;
    private String gia;
    private int img1;
    private int img2;

    public Goods(String name, String txt1, String gia, int img1, int img2) {
        this.name = name;
        this.txt1 = txt1;
        this.gia = gia;
        this.img1 = img1;
        this.img2 = img2;
    }

    public Goods(String name, int img1) {
        this.name = name;
        this.img1 = img1;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTxt1() {
        return txt1;
    }

    public void setTxt1(String txt1) {
        this.txt1 = txt1;
    }

    public String getGia() {
        return gia;
    }

    public void setGia(String gia) {
        this.gia = gia;
    }

    public int getImg1() {
        return img1;
    }

    public void setImg1(int img1) {
        this.img1 = img1;
    }

    public int getImg2() {
        return img2;
    }

    public void setImg2(int img2) {
        this.img2 = img2;
    }
}
