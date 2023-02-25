package com.iweb.tongda64.method.ClassWork;

import java.util.Scanner;

public class Day3classWork01 {
    public static void main(String[] args) {
        int[] student = new int[5];
        Scanner sc = new Scanner(System.in);
        int max = 0;
        for (int i = 0; i < student.length; i++) {
            System.out.println("请输入成绩：");
            student[i] = sc.nextInt();
            if(student[i]>max){
                max = student[i];
            }
        }
        System.out.println(max);
    }
}
