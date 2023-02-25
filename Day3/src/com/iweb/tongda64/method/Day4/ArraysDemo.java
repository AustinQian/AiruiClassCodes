package com.iweb.tongda64.method.Day4;

/*
工具类Arrays通发
*/

import java.util.Arrays;

public class ArraysDemo {
    public static void main(String[] args) {
        int[] arr = {52,43,84,34,64,23,60};
        int[] arr1 = {52,43,84,34,64,23,60};
        System.out.println(Arrays.toString(arr));//将数组以字符串的形式输出

        //Arrays.sort(arr);
        System.out.println(arr == arr1);//false
        System.out.println(Arrays.equals(arr,arr1));//true

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.binarySearch(arr,60));//二分查找

        int[] arr3 = Arrays.copyOf(arr, 5);//复制一个新长度数组
        System.out.println(Arrays.toString(arr3));
    }
}
