package com.iweb.tongda64.method.Day5.InterfaceTest.InterClass;

/**
 * @author ubunt on 2/25/2023.
 * @project Day3
 */
public class Test {
    public static void main(String[] args) {
        //调用访问内部类的方法
        //外部类名.内部类名 对象名 = new 外部类名().new 内部类()；
        Outer.inner inner = new Outer.inner();
        inner.method1();
        Outer.inner.method2();
        Outer.inner.method3(4);
        //多态的写法

    }

}
