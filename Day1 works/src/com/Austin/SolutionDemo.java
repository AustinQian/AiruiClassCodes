package com.Austin;

import java.util.Scanner;
import java .lang.String;

public class SolutionDemo {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        String a;
        String b;
        System.out.println("请输入两串字符，第一个：");
        a = Sc.next();
        System.out.println("第二个：");
        b = Sc.next();
        splice(a,b);
    }

    public static void splice(String a,String b) {
        String c = a+b;
        System.out.println(c);
    }
}


