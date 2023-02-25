package com.iweb.tongda64.method.afterworks.OffWeek1;

public class ManagerTest {
    public static void main(String[] args) {
        Manager m1 = new Manager();
        Manager m2 = new Manager();
        m1.username = "admin";
        m1.password = "O000";
        m2.username = "manager";
        m2.password = "1111";
        m1.show();
        m2.show();
    }
}
