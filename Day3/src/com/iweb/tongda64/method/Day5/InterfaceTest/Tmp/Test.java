package com.iweb.tongda64.method.Day5.InterfaceTest.Tmp;

/**
 * @author ubunt on 2/25/2023.
 * @project Day3
 */
public class Test {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        Zhujiao zhujiao = new Zhujiao();
        Emp emp1 = new Teacher();
        emp1.work();
        Emp emp2 = new Zhujiao();
        emp2.work();
    }
}
