package com.Austin;

import java.util.Scanner;

public class Day2work_3 {
    public static void main(String[] args) {
        int a,b;
        long c,d;
        double e,f;
        float g,h;
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入两个数：");
        a = sc.nextInt();
        b = sc.nextInt();
        AddI(a,b);
        System.out.println("请输入两个数：");
        c = sc.nextLong();
        d = sc.nextLong();
        AddL(c,d);
        System.out.println("请输入两个数：");
        e = sc.nextDouble();
        f = sc.nextDouble();
        AddD(e,f);
        System.out.println("请输入两个数：");
        g = sc.nextFloat();
        h = sc.nextFloat();
        AddF(g,h);
    }

    public static void AddI(int a,int b){
        System.out.println(a+b);
    }

    public static void AddL(long a,long b){
        System.out.println(a+b);
    }

    public static void AddF(float a,float b){
        System.out.println(a+b);
    }

    public static void AddD(double a,double b){
        System.out.println(a+b);
    }

}
