package com.iweb.tongda64.method.OfflineWeek1.Day2;

/**
 * @author ubunt on 2/21/2023.
 * @project Day3
 * String优先使用局部变量
 */
public class SchoolTest {
    public static void main(String[] args) {
        School school = new School(); //this.schoolName则使用全局变量，没有this且没有局部变量就使用此对象

        //调用setter方法来进行对private对象参数的赋值
        school.setSchoolName("南邮通达");
        school.setClassNumber(400);
        school.setTeacherNumber(600);

        //调用getter来获得private对象的值
        String schoolName = school.getSchoolName();
        int classNumber = school.getClassNumber();
        int teacherNumber = school.getTeacherNumber();
        System.out.println(schoolName + "有"+classNumber+"个教室，"+teacherNumber+"个老师");
    }
}
