package com.iweb.tongda64.method.ClassWork;

public class MethodDemo01 {
    public static void main(String[] args) {
        int i = method01(5);
        System.out.println(i);
    }

    public static int method01(int n){
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
}
