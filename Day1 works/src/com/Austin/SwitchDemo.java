package com.Austin;

import java.util.Scanner;

public class SwitchDemo {
    public static void main(String[] args){

        //创建输入对象
        Scanner sc = new Scanner(System.in);

        //提示用户输入
        System.out.println("请输入数字(1-5之间):");
        int num = sc.nextInt();

        //逻辑判断
        switch(num){
            case 1 :
                System.out.println("今天是星期一!");
                break;
            case 2 :
                System.out.println("今天是星期二!");
                break;
            case 3 :
                System.out.println("今天是星期三!");
                break;
            case 4 :
                System.out.println("今天是星期四!");
                break;
            case 5 :
                System.out.println("今天是星期五!");
                break;
            default:
                System.out.println("你输入的内容不对！");

        }
    }
}
