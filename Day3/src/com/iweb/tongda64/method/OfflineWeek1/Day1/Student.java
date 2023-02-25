package com.iweb.tongda64.method.OfflineWeek1.Day1;

public class Student {
    String name;
    int age;
    String gender;

    public Student(){

    }

    public Student(String name){
        this.name = name;
    }

    public Student(String name, int age,String gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }


    public void show(){
        System.out.println(name+"--"+age+"--"+gender);
    }
}
