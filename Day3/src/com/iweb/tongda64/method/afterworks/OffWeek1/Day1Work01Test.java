package com.iweb.tongda64.method.afterworks.OffWeek1;

public class Day1Work01Test {
    public static void main(String[] args) {
        Day1Work01  pc1 = new Day1Work01();
        pc1.ram = 100000;
        pc1.brand = "Asus";
        pc1.rom= 4096;
        pc1.CPUModel = "I3";
        pc1.color = "White";
        pc1.MotherBoard = "B360H";
        pc1.vMemory = 8192;
        pc1.Start();
        pc1.shutdown();
        pc1.sleep();
    }
}
