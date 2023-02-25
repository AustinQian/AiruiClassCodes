package com.iweb.tongda64.method.OfflineWeek1.Day3Eve.ObjectWork;

/**
 * @author ubunt on 2/23/2023.
 * @project Day3
 */
public class Flower {
    private double price;
    private String color;

    public Flower() {
    }

    public Flower(double price, String color) {
        this.price = price;
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void showInfo(){
        System.out.println("花的价格是："+price+"花的颜色是："+color);
    }
}
