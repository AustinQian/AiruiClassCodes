package com.iweb.tongda64.method.ClassWork;

import java.util.Scanner;

public class Day3ClassWork {
    public static void main(String[] args) {
        int m;
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入经过的时间（月份）：");
        m = sc.nextInt();
        System.out.println(Calc(m));
    }

    public static int Calc(int month){
        if(month == 0){
            return 0;
        }else if(month==1){
            return 1;
        }
        else{
            return Calc(month-2)+Calc(month-1);
        }
    }
}
