package com.iweb.tongda64.method.OfflineWeek1.Day3Eve;

/**
 * @author ubunt on 2/22/2023.
 * @project Day3
 */
public class Test {
    public static void main(String[] args) {
        //1.创建宠物对象
        Pet pet = new Pet(); //调用父类无参
        pet.show();

        //2.创建小狗对象
        Dog dog = new Dog();
        dog.setName("旺财");
        dog.setHealth(90);
        dog.setLove(60);
        dog.setStrain("二哈");
        dog.show();
        //3.创建小猫对象
        Cat cat = new Cat();
        cat.setHealth(80);
        cat.setLove(70);
        cat.setName("Kitty");
        cat.setSex("母猫");
        cat.show();
        //4.使用dog类的构造方法实例化对象
        Dog dog1 = new Dog("汪柴",90,20,"二哈");
        dog1.show();
    }
}
