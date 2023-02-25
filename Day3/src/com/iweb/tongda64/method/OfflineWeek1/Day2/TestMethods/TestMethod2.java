package com.iweb.tongda64.method.OfflineWeek1.Day2.TestMethods;

/**
 * @author ubunt on 2/21/2023.
 * @project Day3
 * 字符串类型是引用类型,但是作为参数传递值时，不会影响原值
 */
public class TestMethod2 {
    public void change(String str){
        str = "jack";
    }

    public static void main(String[] args) {

        //String str = "Tom";
        //System.out.println(str);

        //TestMethod2 t = new TestMethod2();
        //t.change(str);
        //System.out.println(str); //仍是tom
    }
}
