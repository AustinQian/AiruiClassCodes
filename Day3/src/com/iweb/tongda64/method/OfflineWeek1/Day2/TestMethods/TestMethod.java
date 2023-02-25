package com.iweb.tongda64.method.OfflineWeek1.Day2.TestMethods;

/**
 * @author ubunt on 2/21/2023.
 * @project Day3
 */
public class TestMethod {
    public void change(int a){
        a = 20;
    }

    public static void main(String[] args) {
        int a = 10;
        System.out.println(a); //输出是10
        TestMethod t = new TestMethod();
        t.change(a);
        System.out.println(a); //输出是10


    }
}
