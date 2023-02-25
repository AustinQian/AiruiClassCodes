package com.iweb.tongda64.method.OfflineWeek1.Day2.TestMethods;

/**
 * @author ubunt on 2/21/2023.
 * @project Day3
 * 数组是引用类型
 */
public class TestMethod3 {
    public void change(int[] arr){
        arr[0] = 20;
    }

    public static void main(String[] args) {
        int[] arr = {10};
        System.out.println(arr[0]);

        TestMethod3 t = new TestMethod3();
        t.change(arr);
        System.out.println(arr[0]);
    }
}
