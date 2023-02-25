package com.Austin;

public class WhileDemo01 {
    public static void main(String[] args) {
        int i = 0;
        int sum = 0;
        /*while(i<=100){
            sum = sum+ i;
            i+=2;
        }
        System.out.println(sum);*/
        do{
            sum +=i;
            i+=2;

        }while(i<=100);
        System.out.println(sum);
    }
}

