package com.iweb.tongda64.method.OfflineWeek1.Day3;

/**
 * @author ubunt on 2/22/2023.
 * @project Day3
 */
public class StaticTest02 {
    static {  //静态代码块
        int a =100;
        System.out.println(a);
    }

    static {  //静态代码块2
        int b =200;
        System.out.println(b);
    }

    {  //构造代码块
        int x =1000;
        System.out.println(x);
    }
    public StaticTest02(){ //构造方法1
        System.out.println("StaticTest02 -1");
    }

    public StaticTest02(int a){//构造方法2
        System.out.println("StaticTest02 -1 -2");
    }
    { //构造代码块2
        int y =2;
        System.out.println(y);
    }
}
