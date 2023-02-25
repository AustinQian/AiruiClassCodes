package com.iweb.tongda64.method.Day5.InterfaceTest.MultiDemo;

/**
 * @author ubunt on 2/25/2023.
 * @project Day3
 */
public class Student extends Person{
    public int num =200;
    @Override
    public void work() {
        System.out.println("学生学习");
    }

    @Override
    public void show() {
        System.out.println(num);
    }

    static void method(){
        System.out.println("父类静态");
    }
    public void study(){
        System.out.println("Student learning");
    }
}
