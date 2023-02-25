package com.iweb.tongda64.method.Day4;

import java.lang.String;

public class SortChar {
    public static void main(String[] args) {
        String s = "asohwqukgefaf";
        char[] ch = s.toCharArray();

        insertionSort(ch);
        String st = String.valueOf(ch);
        System.out.println(st);
    }


    public static void insertionSort(char[] arr){
        if(arr == null || arr.length <= 1){
            return;
        }
        //声明一个要插入的数字，这个数字是有序序列后面的第一个数
        char insertNum;
        //从第二个元素开始，第一个元素被当做有序序列
        for (int i = 1; i < arr.length; i++) {
            insertNum = arr[i];
            //已经排序好的元素个数
            int j = i-1;
            //这一是循环判断有序序列的数值是否大于要插入数值
            while (j >= 0 && arr[j] > insertNum){
                //从后向前循环，将大于insertNum的数都向后移动一位
                arr[j+1] = arr[j];
                j--;
            }
            //将要插入的数值放在插入位置
            arr[j + 1] = insertNum;
        }
    }

    public static void insertionSort(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return;
        }
        //声明一个要插入的数字，这个数字是有序序列后面的第一个数
        int insertNum;
        //从第二个元素开始，第一个元素被当做有序序列
        for (int i = 1; i < arr.length; i++) {
            insertNum = arr[i];
            //已经排序好的元素个数
            int j = i - 1;
            //这一是循环判断有序序列的数值是否大于要插入数值
            while (j >= 0 && arr[j] > insertNum) {
                //从后向前循环，将大于insertNum的数都向后移动一位
                arr[j + 1] = arr[j];
                j--;
            }
            //将要插入的数值放在插入位置
            arr[j + 1] = insertNum;
        }
    }

}
