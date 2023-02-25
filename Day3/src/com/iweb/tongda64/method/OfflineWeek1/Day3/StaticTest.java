package com.iweb.tongda64.method.OfflineWeek1.Day3;

/**
 * @author ubunt on 2/22/2023.
 * @project Day3
 */
public class StaticTest {
    static int num = 100;
    //静态代码块1
    static{
        num +=100;
        System.out.println(num);
    }
    //静态代码块2
    static{
        num +=100;
        System.out.println(num);
    }

    public static void main(String[] args) {
        StaticTest t1 = new StaticTest();
        StaticTest t2 = new StaticTest();
        System.out.println(StaticTest.num);
    }
}
