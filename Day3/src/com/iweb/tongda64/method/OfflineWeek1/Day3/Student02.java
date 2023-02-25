package com.iweb.tongda64.method.OfflineWeek1.Day3;

/**
 * @author ubunt on 2/22/2023.
 * @project Day3
 */
public class Student02 extends Person {
    private String className;

    public Student02(String name,int age,String gender,String className){
        System.out.println(name+age+gender);
        this.className = className;
    }


    public Student02(){
    }



    public void show(){
        super.ShowInfo();
        System.out.println("show2");
    }
}
