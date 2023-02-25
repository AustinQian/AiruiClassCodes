package com.iweb.tongda64.method.OfflineWeek1.Day3Eve.Override;

/**
 * @author ubunt on 2/22/2023.
 * @project Day3
 */
public class Son extends Father{

     //访问权限不能严于父类
    //private void method1(){}
    //父类为静态，不能覆盖为非静态
    //public void method2(){}
    //子类可以定义与父类同名的静态方法，但是他们的关系不能重写
    public static void method2(){
        System.out.println("子类的静态方法");
    }

    //返回值类型与父类相同或者是父类方法的子类
    public Son method3(){
        System.out.println("Son method3 used");
        return new Son();
    }
    public void method4(){
        System.out.println("Son method,");
    }

    public static void main(String[] args) {
        Son s1 = new Son();
        s1.method1();
        s1.method2();
        s1.method3();
        s1.method4();
    }
}
