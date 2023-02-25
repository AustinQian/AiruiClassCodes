package com.iweb.tongda64.method.OfflineWeek1.Day3Eve;

/**
 * @author ubunt on 2/22/2023.
 * @project Day3
 * 1.为什么要继承？ ：主要是提高代码的复用性。
 */
public class Pet {
    private String name="未知"; //宠物名字
    private int health = 60; //健康值
    private int love = 20; //亲密度

    //无参构造

    public Pet() {
        System.out.println("这是父类的无参构造");
    }

    public Pet(String name) {
        this.name = name;
    }

    //有参构造
    public Pet(String name, int health, int love) {
        this.name = name;
        this.health = health;
        this.love = love;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        if(health <0 || health >100){
            System.out.println("健康值不能小于0或者超过100，设置错误，默认值为60");
            this.health = health;
            return;
        }
        this.health = health;
    }

    public int getLove() {
        return love;
    }

    public void setLove(int love) {
        if(love<0|| love >100){
            this.love = 10;
            return;
        }
        this.love = love;
    }

    public void show(){
        System.out.println("宠物自我介绍：我的名字叫"+this.name+"，我的健康值是"+this.health+"，我和主人的亲密度是"+love);
    }
}
