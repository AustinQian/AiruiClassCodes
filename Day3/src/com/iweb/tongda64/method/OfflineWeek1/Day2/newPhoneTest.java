package com.iweb.tongda64.method.OfflineWeek1.Day2;

public class newPhoneTest {
    public static void main(String[] args) {

        newPhone phone1 = new newPhone();
        newPhone phone2 = new newPhone("iphone","白色",9999.99);
        phone1.name = "三星";
        phone1.color ="红色";
        phone1.price = 8999.89;
        phone1.call("张三");
        phone1.message("李四");
        phone2.statics();
        phone1 .statics();

    }
}
