package com.iweb.tongda64.method.afterworks.OffWeek1;

public class Day1Work01 {
        String brand;
        String color;
        String CPUModel;
        double rom;
        double ram;
        double vMemory;
        String MotherBoard;
        void Start(){
            System.out.println(brand + "开机了");
        }
        void shutdown(){
            System.out.println(brand + "关机了");
        }
        void sleep(){
            System.out.println(brand + "待机");
        }
}
