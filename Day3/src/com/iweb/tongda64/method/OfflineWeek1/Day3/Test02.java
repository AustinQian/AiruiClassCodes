package com.iweb.tongda64.method.OfflineWeek1.Day3;

/**
 * @author ubunt on 2/22/2023.
 * @project Day3
 */
public class Test02 {
    public static void main(String[] args) {
        /*{ //局部代码块
            int i = 10;
            System.out.println(i);
        }
        System.out.println("-------");
        StaticTest02 s1 = new StaticTest02();
        System.out.println("-------");
        StaticTest02 s3 = new StaticTest02(10);*/

        Student02 s1 = new Student02();
        s1.setName("张三");
        s1.setAge(21);
        s1.setGender("男");
        s1.show();
        System.out.println("----");

        Student02 s2 = new Student02("张四", 23, "男","name");
        s2.show();
    }

    /*
    10
    -----
    100
    200
    1000
    2
    StaticTest02 -1
    -----
    1000
    2
    StaticTest02 -1 -2

    */
}
