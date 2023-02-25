package com.iweb.tongda64.method.OfflineWeek1.Day3Eve;

import com.iweb.tongda64.method.OfflineWeek1.Day3Eve.Override.Father;

/**
 * @author ubunt on 2/22/2023.
 * @project Day3
 */
public class Cat extends Pet{
    private String sex;

    public Cat() {
        System.out.println("这是cat类的无参构造");
    }

    public Cat(String sex) {
        this.sex = sex;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
    public void show(){
        super.show();
        System.out.println("我是"+sex);
    }

    @Override
    public boolean equals(Object Obj) {
        if(this == Obj){
            return true;
        }
        if(!(Obj instanceof Cat)){
            return false;
        }

        Cat cat = (Cat) Obj;
        if(this.sex.equals(sex)){
            return true;
        }else {
            return false;
        }
    }

}
