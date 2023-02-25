package com.iweb.tongda64.method.OfflineWeek1.Day3Eve.Override;

/**
 * @author ubunt on 2/22/2023.
 * @project Day3
 */
public class Father {

    public void method1(){
        System.out.println("Father method1");
    }
    public static void method2(){
        System.out.println("Father method2");
    }
    public Father method3(){
        System.out.println("Father method3");
        return new Father();
    }
    private void method4(){
        System.out.println("Father method4");
    }


}
