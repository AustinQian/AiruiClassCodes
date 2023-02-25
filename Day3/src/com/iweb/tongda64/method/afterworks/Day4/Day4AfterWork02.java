package com.iweb.tongda64.method.afterworks.Day4;

import java.lang.String;
import java.util.Random;

public class Day4AfterWork02 {
    public static void main(String[] args) {
            String[] LastName = new String[] { "赵", "钱", "孙", "李", "周", "吴", "郑", "王" }; //姓氏
            String[] FirstName = new String[] { "天", "地", "玄", "黄", "宇", "宙", "洪", "荒", "东方" }; //名字
            Random random = new Random();
            for (int i = 0; i < 5; i++) {
                String xings = LastName[random.nextInt(LastName.length)];
                int count = random.nextInt(2)+1;
                String ming = "";
                for (int j = 0; j < count; j++) {
                    ming += FirstName[random.nextInt(FirstName.length)];
                }
                String generator = xings + ming;
                System.out.println("随机拼接生成的姓名是>>>" + generator);
            }
        }


    /*Random random = new Random();
        String[] Firstname = {"世翰","仁杰","涛宇","奕辰","浩然"};
        String[] Lastname = {"赵","钱","孙","李","周"};
        String name = "";
        for (int i = 0; i <5; i++) {
            String TmpXing = Firstname[random.nextInt(Firstname.length)];
            int count = random.nextInt(3);
            for (int j = 0; j < count; j++) {
                name += Lastname[random.nextInt(Firstname.length)];

            }


        }*/
}
