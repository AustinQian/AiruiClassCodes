package com.iweb.tongda64.method.OfflineWeek1.Day4Eve;

/**
 * @author ubunt on 2/23/2023.
 * @project Day3
 */
public abstract class Animal {
    private String name;

    public Animal() {
    }

    public Animal(String name) {
        this.name = name;
    }
    public static void method(){
        System.out.println("静态方法在抽象类中，一般表示类特有的功能，这种功能不依赖于雷达具体实现");
    }

    public abstract void eat();
    public void sleep(){
        System.out.println("sleep");
    }
}
