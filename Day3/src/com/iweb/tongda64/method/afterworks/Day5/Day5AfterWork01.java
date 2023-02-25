package com.iweb.tongda64.method.afterworks.Day5;

public class Day5AfterWork01 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2*i-1; j++) {
                System.out.print(5-i);
            }
            System.out.println();
        }
        for (int i = 0; i <= 5; i++) {
            for (int j = 5; j >= 5-i; j--) {
                System.out.print(" ");
            }
            for (int j = 5; j >= 2*i-1; j--) {
                System.out.print(i+1);
            }
            System.out.println();
        }
    }
}
