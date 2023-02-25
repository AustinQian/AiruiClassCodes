package com.iweb.tongda64.method.OfflineWeek1.Day3;

/**
 * @author ubunt on 2/22/2023.
 * @project Day3
 */
public class Person {
    private String name;
    private int age;
    private String gender;

    public Person() {
    }

    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void eat(){
        System.out.println("人类会吃饭");
    }
    public void ShowInfo(){
        System.out.println(name+"---"+age+"---"+gender+"---");
    }
}
