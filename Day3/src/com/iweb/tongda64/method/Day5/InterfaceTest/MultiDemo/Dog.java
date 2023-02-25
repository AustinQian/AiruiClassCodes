package com.iweb.tongda64.method.Day5.InterfaceTest.MultiDemo;

/**
 * @author ubunt on 2/25/2023.
 * @project Day3
 */
public class Dog extends Animal{
    @Override
    public void sleep() {
        System.out.println("Dog only sleep for short period of time");
    }

    @Override
    public void eat() {
        System.out.println("Dog eats bone");
    }
}
