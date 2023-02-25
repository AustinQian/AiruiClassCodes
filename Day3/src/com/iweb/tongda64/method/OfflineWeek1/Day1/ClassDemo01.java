package com.iweb.tongda64.method.OfflineWeek1.Day1;

import java.lang.String;

public class ClassDemo01 {
    public static void main(String[] args) {

        /*mouse m = new mouse();
        m.brand="logetic";
        m.name = "GPW";
        m.usage = "Gaming";
        m.price = 499.99;
        m.control();*/

        phone iphone = new phone();
        iphone.brand = "Iphone";
        iphone.name = "14 pro";
        iphone.price = 9999.99;
        iphone.call();
        iphone.message();
        iphone.price();

        headphone sony = new headphone();
        sony.brand = "Sony";
        sony.Model = "XM5";
        sony.price = 2999.99;
        sony.price();
    }
    /*1：
      类：鼠标类，鼠标品牌，名字，用途，价格，可以操作电脑的光标
      对象：罗技鼠标，GPW，中号，无线，游戏鼠标，499，可以操作电脑的光标

      2：
      类：手机类，手机品牌，名字，价格,可以打电话，发短信
      对象：苹果手机，iPhone14，9999，可以打电话，发短信

      3：
      类：耳机类，耳机品牌，名字，价格,可以听音乐
      对象：索尼耳机，XM5，2999，可以听音乐
    */
    public static class mouse{
        String brand;
        String name;
        String usage;
        double price;
        void control(){
            System.out.println(name + "控制了鼠标");
        }
    }
    public static class phone{
        String brand;
        String name;
        double price;

        void call(){
            System.out.println("用"+brand+name+"打了电话");
        }
        void message(){
            System.out.println("用"+brand+name+"发了信息");
        }
        void price(){
            System.out.println("价格是"+price);
        }
    }
    public static class headphone{
        String brand;
        String Model;
        double price;
        void PlayMusic(){
            System.out.println("用"+brand+Model+"在听歌");
        }
        void price(){
            System.out.println("价格是"+price);
        }
    }


}
