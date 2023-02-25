package com.iweb.tongda64.method.OfflineWeek1.Day2;

/**
 * @author ubunt on 2/21/2023.
 * @project Day3
 */
public class StudentManager {
    //输出学生信息，参数是一个学生数组
    //创建一个类的数组
    public void ShowInfo(Student[] students){
        for(Student student: students){
            student.ShowInfo();
        }
    }

    public static void main(String[] args) {
        Student s1 = new Student("张三",80);
        Student s2 = new Student("李四",70);
        Student s3 = new Student("王五",78);
        Student s4 = new Student("张三丰",69);

        //先创建学生数组
        Student[] students = new Student[4];
        students[0]=s1;
        students[1]=s2;
        students[2]=s3;
        students[3]=s4;


        //StudentManager studentManager = new StudentManager();
        new StudentManager().ShowInfo(students);
    }
}
