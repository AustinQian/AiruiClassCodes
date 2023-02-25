package com.iweb.tongda64.method.Day5.InterfaceTest.InterClass;

/**
 * @author ubunt on 2/25/2023.
 * @project Day3
 */
//外部类
public class Outer {
    private int num = 10; //外部类私有成员
    private static int num2  = 1000;
    //内部类：成员访问特点
    //      1.内部类可以直接访问外部类的成员，包括私有成员
    //      2.外部类要访问内部类的成员，必须创建对象
    static class inner{
        public void method1(){
            //System.out.println(num); 不能直接使用外部非静态成员变量
            System.out.println(num2); //可以使用外部类的静态成员变量
            System.out.println("inner non static method 1");
        }
        public static void method2(){
            // System.out.println(num);
            System.out.println(num2);
            System.out.println("inner static method 2");
        }
        public static void method3(int q){
            System.out.println(q+num2);
            System.out.println("inner static method 3");
        }
    }


    //局部内部类，在外部类的方法中
    public void method(){
        //局部位置
        class Inner{

        }
    }
}
