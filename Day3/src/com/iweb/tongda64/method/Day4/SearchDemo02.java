package com.iweb.tongda64.method.Day4;

public class SearchDemo02 {
    public static void main(String[] args) {
        int[] arr = {11,22,33,44,55,66,77,88,99};
        int index = GetIndex(arr,77);
        System.out.println(index);
    }

    //写一个二分查找法
    public static int GetIndex(int[] arr,int value){
        //找到最大值、最小值、中间值
        int max = arr.length-1;
        int min = 0;
        int mid = (max+min)/2;

        while(arr[mid]!=value){
            if(arr[mid]>value){
                max = mid-1;
            }else if(arr[mid] < value){
                min=mid+1;
            }
            if(min>max){
                System.out.println("该数字不存在");
                return -1;
            }
            mid = (max+min)/2;
        }
        return mid;
    }


    public static int GetInt(int[] arr, int v){
        int max = arr.length-1;
        int min = 0;
        int mid = (min+max)/2;

        while(arr[mid]!=v){
            if(arr[mid]>v){
                max = mid-1;
            } else if (arr[mid]<v) {
                min = mid+1;
            }
            if(min > max){
                System.out.println("该数不存在");
                return -1;
            }
            mid = (max + min)/2;
        }
        return mid;
    }
}
