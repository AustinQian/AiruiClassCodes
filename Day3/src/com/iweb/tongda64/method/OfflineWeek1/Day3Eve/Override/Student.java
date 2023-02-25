package com.iweb.tongda64.method.OfflineWeek1.Day3Eve.Override;

import java.util.Objects;

/**
 * @author ubunt on 2/22/2023.
 * @project Day3
 */
public class Student {
    private int sid;
    private String name;
    private int age;

    public Student() {
    }

    public Student(int sid, String name, int age) {
        this.sid = sid;
        this.name = name;
        this.age = age;
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

   /* @Override //object范围大
    public boolean equals(Object obj) {
        //重写equals()方法，如果学生的学号、姓名、年龄都相同，就是同一个学生
        //调用equals比较好返回true
        if(this == obj){
            return true;
        }
        if(!(obj instanceof Student)){
            return false;
        }
        //把传入的参数，强制转换为Student类型
        //传进来的参数，不转的话，他是一个Object类型
        Student student = (Student)obj;
        if(this.sid == student.sid && this.name.equals(student.name) && this.age == student.age)
        {
            return true;
        }else {
            return false;
        }
    }*/

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return sid == student.sid && age == student.age && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sid, name, age);
    }

    @Override //重写toString后，将对象以字符串形式输出而非地址值
    public String toString() {
        return "Student{" +
                "sid=" + sid +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
