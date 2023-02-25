package com.iweb.tongda64.method.OfflineWeek1.Day2;

/**
 * @author ubunt on 2/21/2023.
 * @project Day3
 */
public class MethodsDemo01 {
    //写一个重载的求和方法，整数型，浮点型，整数和浮点

    public int getSum(int no1,int no2){
        return no1+no2;
    }
    public double getSum(double no1, double no2){
        return no1+no2;
    }
    public double getSum(double no1,int no2){
        return no1+no2;
    }

    //Multiplier methods
    public int getMulti(int a, int b){
        return a*b;
    }
    public double getMulti(double a, double b){
        return a*b;
    }
    public double getMulti(double a, int b){
        return a*b;
    }


    public static void main(String[] args) {
        MethodsDemo01 methodsDemo01 = new MethodsDemo01();
        int a = methodsDemo01.getSum(4,5);
        double b = methodsDemo01.getSum(3.5,2);
        double c = methodsDemo01.getSum(24.5,34.7);
        System.out.println(a+" "+b+ " "+c);

        MethodsDemo01 methodsDemo02 = new MethodsDemo01();
        int x = methodsDemo01.getMulti(4,5);
        double y = methodsDemo01.getMulti(4.6,5.9);
        double z = methodsDemo01.getMulti(4.6,9);
        System.out.println(x+" "+ y +" "+ z +" ");
    }
}
