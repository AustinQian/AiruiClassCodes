package com.iweb.tongda64.method.OfflineWeek1.Day3Eve;

/**
 * @author ubunt on 2/22/2023.
 * @project Day3
 */
public class Dog extends Pet{
    private String strain;

    public Dog() {
        System.out.println("这是dog类的无参构造");
    }

    public Dog(String name, int health, int love, String strain) {
        super(name, health, love);
        this.strain = strain;
    }

    public Dog(String name, String strain) {
        super(name);
        this.strain = strain;
    }

    public Dog(String strain) {
        this.strain = strain;
    }

    public String getStrain() {
        return strain;
    }

    public void setStrain(String strain) {
        this.strain = strain;
    }

    public void show(){
        super.show();
        System.out.println("我是"+strain);
    }
}
