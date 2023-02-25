package com.iweb.tongda64.method.Day5.InterfaceTest.MultiDemo;

/**
 * @author ubunt on 2/25/2023.
 * @project Day3
 */
public class AnimasTest {
    public static void main(String[] args) {
        Animal ani = new Cat();
        ani.eat();
        ani.sleep();

        Cat ca = (Cat) ani;
        ca.play();
    }
}
