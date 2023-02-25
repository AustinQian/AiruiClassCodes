package com.iweb.tongda64.method.Day5.InterfaceTest;

/**
 * @author ubunt on 2/25/2023.
 * @project Day3
 */
public class Son implements Father,Mother{
    @Override
    public void playFootball() {
        System.out.println("儿子会踢球");
    }
    @Override
    public void sing(){
        System.out.println("儿子会唱歌");
    }

    @Override
    public String name() {
        return "Son";
    }

    public static void main(String[] args) {
        Son son = new Son();
    }


    // 多态的写法
    // 父类的引用指向子类的对象
    Father father = new Son();
}
