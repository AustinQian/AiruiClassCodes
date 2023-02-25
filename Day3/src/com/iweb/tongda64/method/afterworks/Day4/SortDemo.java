package com.iweb.tongda64.method.afterworks.Day4;

import java.util.Random;
import java.util.Scanner;

public class SortDemo {
    public static void main(String[] args) {

        int[] arr = new int[100000];
        Random random = new Random();
        int j = random.nextInt(1000);

        for (int i = 0; i < 100000; i++) {
            arr[i] = j;
        } //向数组添加随机数

        long c = System.currentTimeMillis();
        quickSort(arr,0,arr.length-1);
        long d = System.currentTimeMillis();
        System.out.println("快速排序时间："+(d-c)+"毫秒(1万个)");

        long a = System.currentTimeMillis();
        bubbleSort(arr);
        long b = System.currentTimeMillis();
        System.out.println("冒泡排序时间："+(b-a)+"毫秒(1万个)");


    }

    //冒泡排序
    public static void bubbleSort(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            System.out.print(arr[i] + " ");
        }
    }


    public static void insertionSort(int[] arr){
        if(arr == null|| arr.length <=1){
            return;
        }
        int insertNum;
        for (int i = 0; i < arr.length; i++) {
            insertNum = arr[i];
            int j = i-1;

            while(j>=0&&arr[j]>insertNum){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=insertNum;
        }
    }



    //选择排序
    public static void selectionSort(int[] arr){
        if(arr == null || arr.length <= 1){
            return;
        }
        for (int i = 0; i < arr.length - 1; i++) {
            //保存一个最小值的下标，第一次排序就是第一个元素
            int minIndex = i;
            //从i+1开始往后循环
            for (int j = i+1; j < arr.length ; j++) {
                //如果后面的元素比之前定义的最小值小，把这个元素的下标替换之前的最小值下标
                if (arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }
            //交换元素，拿最小值下标的元素和无序区第一个值做交换
            if(i != minIndex){
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
    }

    //快速排序
    public static void quickSort(int[] arr,int left,int right){
        int i,j,temp,t;
        if(left > right){
            return;
        }
        i = left;
        j = right;
        temp = arr[left];
        while (i < j){
            while (arr[j] >= temp && i < j){
                j--;
            }
            while (arr[i] <= temp && i < j){
                i++;
            }
            if(i < j){
                t = arr[j];
                arr[j] = arr[i];
                arr[i] = t;
            }
        }
        arr[left] = arr[i];
        arr[i] = temp;
        quickSort(arr,left,j-1);
        quickSort(arr,j+1,right);
    }

}
