package com.iweb.tongda64.method.OfflineWeek1.Day2Eve;

/**
 * @author ubunt on 2/21/2023.
 * @project Day3
 */
public class School3 {
    private String name;
    private int age;
    protected int id;


    public School3() {
    }

    public School3(String name, int age, int id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }
    public void setSchoolName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void show(){
        System.out.println();
    }
}
