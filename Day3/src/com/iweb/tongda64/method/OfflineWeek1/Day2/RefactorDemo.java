package com.iweb.tongda64.method.OfflineWeek1.Day2;

/**
 * @author ubunt on 2/21/2023.
 * @project Day3
 */
public class RefactorDemo {
    public String c(float a){
        return "b";
    }
    public String c(int a){

        return "bs";
    }
    public String c(int a, double b){
        return "c";
    }

    public static void main(String[] args) {
        RefactorDemo r = new RefactorDemo();
        RefactorDemo r1 = new RefactorDemo();
        RefactorDemo r2 = new RefactorDemo();
        r.c(1);
        r1.c(1.2f);
        r2.c(5,4);
        System.out.println(r.c(1) + " " + r1.c(1.2f)+ " " + r2.c(5,4));
    }
}
