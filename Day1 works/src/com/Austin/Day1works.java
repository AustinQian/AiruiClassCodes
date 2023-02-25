package com.Austin;

public class Day1works {
    public static void main(String[] args) {
        int i;
        i = 1;
        System.out.println(i); //int类型

        byte p = 20;
        System.out.println(p);

        short q = 30;
        System.out.println(q);

        float n = 32.13f;
        System.out.println(n); //float类型

        //double m = 5.12;
        //System.out.println(m);

        boolean b = true;
        System.out.println(b);

        System.out.println(4567%10);
        System.out.println(4567/10%10);
        System.out.println(4567/10/10%10);
        System.out.println(4567/10/10/10);

        int j=10,k=20,m=30;
        int max = (j>k?j:k)>m?(j>k?j:k):m;
        System.out.println(max);


    }
}
