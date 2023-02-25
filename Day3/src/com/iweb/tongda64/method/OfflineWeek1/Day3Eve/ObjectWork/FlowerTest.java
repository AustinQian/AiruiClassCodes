package com.iweb.tongda64.method.OfflineWeek1.Day3Eve.ObjectWork;

/**
 * @author ubunt on 2/23/2023.
 * @project Day3
 */
public class FlowerTest {
    public static void main(String[] args) {
        Flower f1 = new Flower();
        f1.setColor("白色");
        f1.setPrice(10);
        f1.showInfo();
        Rose r1 = new Rose();
        r1.setPrice(30);
        r1.setColor("紫色");
        r1.setOrigin("大理");
        r1.showInfo();
        r1.warn();
    }
}
