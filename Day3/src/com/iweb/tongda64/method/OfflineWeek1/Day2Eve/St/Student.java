package com.iweb.tongda64.method.OfflineWeek1.Day2Eve.St;

/**
 * @author ubunt on 2/21/2023.
 * @project Day3
 */
public class Student {
    String name; //成员变量在堆中，随着对象的创建而创建
    int age;
    static String className; //static只有一个值，被修改后就会发生变化

    //static修饰优先于对象，static随着类加载而加载，此时name和age成员变量还没加载   静态方法中不能调用普通变量,也不能调用普通方法
    //静态方法中只能访问静态变量和静态方法
    public /*static --> 只能调用静态变量和静态方法*/ void show(){
        test();
        System.out.println(name+"--"+age+"--"+className);
    }

    public void test(){
        System.out.println("test");
    }
}
