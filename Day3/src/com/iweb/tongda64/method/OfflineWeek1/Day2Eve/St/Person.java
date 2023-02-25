package com.iweb.tongda64.method.OfflineWeek1.Day2Eve.St;

/**
 * @author ubunt on 2/21/2023.
 * @project Day3
 */
public class Person {
    int num = 10;
    static int num2 = 20;
    public void test(){
        System.out.println(num);
        //普通方法可以正常调用静态变量
        System.out.println(num2);
    }

    public static void test1(){
        //静态方法中，无法调用非静态变量
        //System.out.println(num);
        System.out.println(num2);
    }

    public static void main(String[] args) {
        Person p = new Person();
        System.out.println(p.num);
        System.out.println(p.num2);
        System.out.println(Person.num2);

        //在main方法中，直接调用当前类成员变量，无法调用非静态的变量
        // System.out.println(num); -->报错
        System.out.println(num2);

        //main方法中，普通的方法无法直接被调用，
        //test();
        test1();
    }
}
