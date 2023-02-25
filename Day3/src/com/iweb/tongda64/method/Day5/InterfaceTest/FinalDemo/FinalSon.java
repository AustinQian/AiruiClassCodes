package com.iweb.tongda64.method.Day5.InterfaceTest.FinalDemo;

/**
 * @author ubunt on 2/25/2023.
 * @project Day3
 */
public class FinalSon extends FinalDemo{
    public static void main(String[] args) {
        final int x =100;
        System.out.println(x);
        // x=1000; 不能给final修饰的变量重新赋值
        final FinalDemo finalDemo = new FinalDemo();
        System.out.println(finalDemo.age);
        finalDemo.age = 100;
        System.out.println(finalDemo.age); //引用了final里的属性的值是可变的
    }

}
