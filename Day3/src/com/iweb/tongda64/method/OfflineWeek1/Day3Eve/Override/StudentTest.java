package com.iweb.tongda64.method.OfflineWeek1.Day3Eve.Override;

/**
 * @author ubunt on 2/23/2023.
 * @project Day3
 */
public class StudentTest {
    public static void main(String[] args) {
        Student s1 = new Student(01,"张三",22);
        Student s2 = new Student(01,"张三",22);
        //Student student = new Student();

        System.out.println(s1.equals(s2));

    }
}
