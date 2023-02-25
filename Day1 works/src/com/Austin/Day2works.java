package com.Austin;

import java.util.Scanner;

public class Day2works {
    public static void main(String[] args) {
        /*Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数字:");
        int a = sc.nextInt();
        System.out.println("请输入第二个数字:");
        int b = sc. nextInt();
        int sum = a+b;
        System.out.println("和是:" + sum);*/


        Scanner s = new Scanner(System.in);
        System.out.println("请输入第一个数字:");
        int n = s.nextInt();
        System.out.println("请输入第二个数字:");
        int m = s. nextInt();
        int temp;
        temp = n;
        n = m;
        m = temp;
        System.out.println("交换后：" + n + " " + m);

    }
}
