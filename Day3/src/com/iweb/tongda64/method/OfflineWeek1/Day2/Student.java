package com.iweb.tongda64.method.OfflineWeek1.Day2;

/**
 * @author ubunt on 2/21/2023.
 * @project Day3
 */
public class Student {
    //成员属性
    private String name; //姓名
    private int age;
    private int height; //分数
    //方法
    public void ShowInfo(){
        System.out.println(name + "的成绩是："+height);
    }

    public Student() {
    }

    public Student(String name, int score) {
        this.name = name;
        this.height = score;
    }

    //成员方法
    public void show(){
        System.out.println(name+"--"+age+"--"+height);
    }
}
