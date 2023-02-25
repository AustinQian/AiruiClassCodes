package com.iweb.tongda64.method.ClassWork;

import java.lang.String;
import java.util.Scanner;

public class ArrayDemo01 {
    public static void main(String[] args) {
        String[] Sarr = new String[4];
        String[] Sarr01 = {"ab","abc","abd","abe","abf"};

        Sarr[0]="ab";
        Sarr[1]="abc";
        Sarr[2]="abd";
        Sarr[3]="abe";
        Sarr[4]="abf";

        for (int i = 0; i <= Sarr.length; i++) {
            System.out.println(Sarr[i]);
        }
        for (int i = 0; i <= Sarr01.length; i++) {
            System.out.println(Sarr01[i]);
        }


    }
}
