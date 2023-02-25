package com.iweb.tongda64.method.OfflineWeek1.Day2;

/**
 * @author ubunt on 2/21/2023.
 * @project Day3
 */
public class FruitMachine {
    //带参数的，有返回值的方法
    String fruit="";
    int Amount=0;

    public FruitMachine(){
        this("苹果");
        System.out.println("榨汁机");
    }
    public FruitMachine(String fruit){
        this(500);
        System.out.println(fruit+"汁");
    }

    public FruitMachine(int Amount) {
        System.out.println("果汁容量是："+Amount+"毫升");
    }



    public static void main(String[] args) {
        //调用有参方法
        FruitMachine f = new FruitMachine();
    }
}
