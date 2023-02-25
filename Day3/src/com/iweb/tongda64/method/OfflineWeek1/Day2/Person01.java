package com.iweb.tongda64.method.OfflineWeek1.Day2;

/**
 * @author ubunt on 2/21/2023.
 * @project Day3
 *
 *  构造方法的抽象调用
 */
public class Person01 {
    String name;
    int age;

    //无参构造：
    public Person01(){
        this("jack");
        System.out.println("无参的构造方法"); //1
        this.show(); //构造方法可以随意调用普通方法
    }

    //调用无参构造方法
    public Person01(String name){
        this(20);
        System.out.println("参数name的构造函数"); //2
    }
    public Person01(int age){
        System.out.println("参数age的构造函数"); //3
    }

    //普通方法
    public void show(){
        System.out.println("show"); //4
    }

    public static void main(String[] args) {
        Person01 person01 = new Person01();
    }
}
