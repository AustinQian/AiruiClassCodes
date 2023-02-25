package com.iweb.tongda64.method.Day5.InterfaceTest.FinalDemo;

/**
 * @author ubunt on 2/25/2023.
 * @project Day3
 * Final修饰的方法不能被重写
 * final修饰的变量，该变量不能被重新赋值，那么该变量其实就是一个常量
 * 常量写法：1. 字面值常量
 *              字符串常量："Hello"
 *              整数常量：10，20
 */
public class FinalDemo {
    int age = 40;
    private final String name=" ";
    public final void method01(){
        System.out.println("Father");
    }
}
