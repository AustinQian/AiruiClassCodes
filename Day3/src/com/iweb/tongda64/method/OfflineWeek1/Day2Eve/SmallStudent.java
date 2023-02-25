package com.iweb.tongda64.method.OfflineWeek1.Day2Eve;

import com.iweb.tongda64.method.OfflineWeek1.Day2Eve.Student;

/**
 * @author ubunt on 2/21/2023.
 * @project Day3
 */
public class SmallStudent extends Student {
    public static void main(String[] args) {
        Student student = new Student();
        student.setAge(20);
        int age = student.getAge();
        System.out.println(age);
    }
}
