package com.iweb.tongda64.method.Day5.InterfaceTest.InterClass;

/**
 * @author ubunt on 2/25/2023.
 * @project Day3
 */
//外部类
public class Outer {
    private int num = 10; //外部类私有成员
    private static int num2  = 1000;
    //内部类：成员访问特点
    //      1.内部类可以直接访问外部类的成员，包括私有成员
    //      2.外部类要访问内部类的成员，必须创建对象
    static class inner{
        public void method1(){
            //System.out.println(num); 不能直接使用外部非静态成员变量
            System.out.println(num2); //可以使用外部类的静态成员变量
            System.out.println("inner non static method 1");
        }
        public static void method2(){
            // System.out.println(num);
            System.out.println(num2);
            System.out.println("inner static method 2");
        }
        public static void method3(int q){
            System.out.println(q+num2);
            System.out.println("inner static method 3");
        }
    }

    //局部变量随着方法的调用而出现，方法调用完毕，就消失了。
    //但是，堆内存的内容不会马上消失，如果不设定为量的话，变量已经消失了。但是堆内存空间还在调用，这种情况是不合理的。
    //所以将他加上final修饰。，把它变为常量，常量存储在常量池中


    //局部内部类，在外部类的方法中
    public void method(){
        int a= 100; //a没有被重新赋值，则默认a是final。
        //a=1000; ->出错    如果访问局部变量，必须被声明为final，JDK 1.8中如果在局部变量没有被重新赋值的情况下，可以省略final
        //局部位置
        class Inner{
            public void test(){
                System.out.println(num);//可正常访问外部类的话成员属性
                //从内部类中访问外部类成员方法的局部变量，需要被声明为final
                System.out.println(a);
            }
        }
        Inner inner = new Inner();
        inner.test();
    }
}
