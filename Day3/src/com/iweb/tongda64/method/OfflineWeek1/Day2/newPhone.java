package com.iweb.tongda64.method.OfflineWeek1.Day2;


public class newPhone {
    String name;
    String color;
    double price;


    //创建类，必须创建一个无参，一个全参 alt+insert


    public newPhone() {
        System.out.println("对象被创建了");
    }

    public newPhone(String name, String color, double price) {
        this.name = name;
        this.color = color;
        this.price = price;
    }

    public void statics(){
        System.out.println(color +"的"+name+"要价"+price+"元");
    }

    public void call(String name){
        System.out.println("打给：" + name);
    }
    public void message(String name){
        System.out.println("给"+name+"发消息");
    }
}
