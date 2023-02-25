package com.iweb.tongda64.method.afterworks.Day5;

public class Day5AfterWork02 {
    public static void main(String[] args) {
        int hen,chicken,rooster;
        for (rooster = 0; rooster < 20; rooster++) {
            for (hen = 0; hen < 33; hen++) {
                chicken  = 100-rooster-hen;
                if((chicken%3==0) && (rooster*5+hen*3+chicken/3 == 100)){
                    System.out.println("公鸡的数量是 "+rooster+"个，母鸡的数量是 "+hen+"个，小鸡的数量是 "+chicken + "个。");
                }
            }
        }
    }
}
