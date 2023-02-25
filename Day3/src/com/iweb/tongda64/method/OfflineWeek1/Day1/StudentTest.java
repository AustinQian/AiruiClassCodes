package com.iweb.tongda64.method.OfflineWeek1.Day1;

public class StudentTest {
    public static void main(String[] args) {
        Student s = new Student();
        Student s1 = new Student("张三");
        Student s2 = new Student("李四",21,"男");
        System.out.println(s.name + "----" + s.age + "----" + s.gender);
        System.out.println(s1.name + "----" + s1.age + "----" + s1.gender);
        System.out.println(s2.name + "----" + s2.age + "----" + s2.gender);
    }
}
