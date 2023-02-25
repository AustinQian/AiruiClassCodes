package com.iweb.tongda64.method.Day5.InterfaceTest.MultiDemo;

/**
 * @author ubunt on 2/25/2023.
 * @project Day3
 */
public class Person {
    public int num = 100;
    public void work(){
        System.out.println("工作");
    }
    public void sleep(){
        System.out.println("睡觉");
    }
    public void play(){
        System.out.println("游戏");
    }

    public void show(){
        System.out.println(num);
    }
    static void method(){
        System.out.println("父类静态");
    }
}
