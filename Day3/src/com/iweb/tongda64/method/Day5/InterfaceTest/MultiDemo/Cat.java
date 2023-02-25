package com.iweb.tongda64.method.Day5.InterfaceTest.MultiDemo;

/**
 * @author ubunt on 2/25/2023.
 * @project Day3
 */
public class Cat extends Animal{
    @Override
    public void eat() {
        System.out.println("Cat eats fish");
    }

    @Override
    public void sleep() {
        System.out.println("Cat always sleep");
    }

    public void play(){
        System.out.println("Cats like to scratch things");
    }
}
