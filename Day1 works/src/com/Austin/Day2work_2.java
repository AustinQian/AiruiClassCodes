package com.Austin;

public class Day2work_2 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 6-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2*i-1; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
