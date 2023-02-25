package com.Austin;

import java.lang.Math;

public class ForDemo {
    public static void main(String[] args) {
        int digit =0;
        int decimal =0;
        int hundred =0;

        for(int i = 100;i<=1000;i++){
            digit = i%10;
            decimal = i/10%10;
            hundred = i/100%10;
            if(i == digit*digit*digit+decimal*decimal*decimal+hundred*hundred*hundred){
                System.out.println(i);
            }
        }

    }
}
