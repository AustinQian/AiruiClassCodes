package com.iweb.tongda64.method.OfflineWeek1.Day2Eve.St;

/**
 * @author ubunt on 2/21/2023.
 * @project Day3
 */
public class StudentTest {
    public static void main(String[] args) {
        Student s = new Student();
        s.name ="张三";
        s.age =20;
        s.className="2班";

        s.show();

        Student s1 = new Student();
        s1.show();
        Student s2 = new Student();
        s2.show();
        Student s3 = new Student();
        s3.className="3班";
        s3.show();
        Student s4 = new Student();
        s4.show();
    }
}
