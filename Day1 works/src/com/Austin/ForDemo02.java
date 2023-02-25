package com.Austin;

import java.util.Scanner;

public class ForDemo02 {
    public static void main(String[] args) {
        //班上一共有10个学生，让用户输入10个学生的成绩进行统计，返回80份以上的学生一共有多少人。
        int score;
        int sum =0;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i <= 10; i++) {
            System.out.println("请输入第" + i +"个学生的成绩");
            score = sc.nextInt();
            if(score>80){
                continue;
            }
            sum++;
        }
        System.out.println("80分以上的学生一共有" + sum +"个");

        /*for(int j  =0;j<5;j++){
            for (int i = 0; i < 5-j; i++) {
                System.out.println(" ");
            }
            for (int i = 0; i < 2*j-1; i++) {
                System.out.println("*");
            }
        }*/
        /*for (int i = 1; i <= 9; i++) {
            for(int j = 1;j<=i;j++){
                System.out.print(i + "*" + j + "=" + (i*j));
            }
            System.out.println();
        }*/
                /*wc:for (int i = 0; i <= 5; i++) {
                    nc:
                    for (int j = 0; j <=5; j++) {
                        if(j == 3){
                            break wc;
                        }
                        System.out.println("*");
                    }
                }*/

    }
    
}
