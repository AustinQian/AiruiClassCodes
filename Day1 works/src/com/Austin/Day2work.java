package com.Austin;

import java.util.Scanner;

public class Day2work {
    public static void main(String[] args) {
        int time;
        Scanner sc = new Scanner(System.in);
        System.out.println("input a 4-digit date：");
        time = sc.nextInt();
        Calc(time);
    }

    public static void Calc(int t){
        int date,month;
        month = t/100;
        date = t%100;
        if(month<1 || month>12 || date <1 ||date>31){
            System.out.println("error input");
            return;
        }else if(month == 2 && date <1 || month ==2 && date>28){
            System.out.println("error input");
            return;
        }
        System.out.println("month:" + month + ",date:" + date);

        switch (month){
            case 01:
                if(date>=1 && date <=20){
                    System.out.println("星座是魔羯座");
                    break;
                } else if (date>20) {
                    System.out.println("星座是水瓶座");
                    break;
                }

            case 02:
                if(date>=1 && date <20){
                    System.out.println("星座是水瓶座");
                    break;
                } else {
                    System.out.println("星座是双鱼座");
                    break;
                }

            case 03:
                if(date>=1 && date <=20){
                    System.out.println("星座是双鱼座");
                    break;
                }else {
                    System.out.println("星座是白羊座");
                    break;
                }

            case 04:
                if(date>=1 && date <=20){
                    System.out.println("星座是白羊座");
                    break;
                }else {
                    System.out.println("星座是金牛座");
                    break;
                }

            case 05:
                if(date>=1 && date <=21){
                    System.out.println("星座是金牛座");
                    break;
                }else {
                    System.out.println("星座是双子座");
                    break;
                }

            case 06:
                if(date>=1 && date <=22){
                    System.out.println("星座是双子座");
                    break;
                }else {
                    System.out.println("星座是巨蟹座");
                    break;
                }

            case 07:
                if(date>=1 && date <=22){
                    System.out.println("星座是巨蟹座");
                    break;
                }else {
                    System.out.println("星座是狮子座");
                    break;
                }

            case 8:
                if(date>=1 && date <=23){
                    System.out.println("星座是狮子座");
                    break;
                }else {
                    System.out.println("星座是处女座");
                    break;
                }

            case 9:
                if(date>=1 && date <=23){
                    System.out.println("星座是处女座");
                    break;
                }
                else {
                    System.out.println("星座天秤座");
                    break;
                }

            case 10:
                if(date>=1 && date <=23){
                    System.out.println("星座是天秤座");
                    break;
                }else {
                    System.out.println("星座是天蝎座");
                    break;
                }

            case 11:
                if(date>=1 && date <=22){
                    System.out.println("星座是天蝎座");
                    break;
                }else {
                    System.out.println("星座是射手座");
                    break;
                }

            case 12:
                if(date>=1 && date <=21){
                    System.out.println("星座是射手座");
                    break;
                }else {
                    System.out.println("星座是摩羯座");
                    break;
                }
        }
    }
}
