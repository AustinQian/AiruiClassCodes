package com.iweb.tongda64.method.ClassWork;

import com.iweb.tongda64.method.afterworks.Day4.SortDemo;

public class Demo {
    public static void main(String[] args) {
        int[] arr={1,44,23,6,29,65,55};
        order(arr);
        System.out.println();
        SortDemo.bubbleSort(arr);
    }
    public static void order(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-1; j++) {
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
            System.out.print(arr[i]+" ");
        }
    }
}
