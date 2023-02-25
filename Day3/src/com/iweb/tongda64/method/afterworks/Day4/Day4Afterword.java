package com.iweb.tongda64.method.afterworks.Day4;

public class Day4Afterword {
    public static void main(String[] args) {
        int flag = 0;
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4; j++) {
                for (int k = 1; k <= 4; k++) {
                    if(i!=j && j!=k&&i!=k){
                        System.out.print(i*100+j*10+k+" ");
                        flag++;
                    }
                }
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("可以组成" + flag +"个");
    }
}
