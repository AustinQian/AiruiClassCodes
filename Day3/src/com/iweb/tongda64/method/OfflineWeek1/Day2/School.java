package com.iweb.tongda64.method.OfflineWeek1.Day2;

/**
 * @author ubunt on 2/21/2023.
 * @project Day3
 * String优先使用局部变量，
 */
public class School {
    private String schoolName;
    private int classNumber;
    private int teacherNumber;

    public School(String schoolName, int classNumber, int teacherNumber) {
        this.schoolName = schoolName;
        this.classNumber = classNumber;
        this.teacherNumber = teacherNumber;
        
    }

    public School() {
    }



    //getters，setters
    public void setSchoolName(String schoolName){
        this.schoolName = schoolName;
    }
    public String getSchoolName(){
        return schoolName;
    }

    public void setClassNumber(int classNumber){
        this.classNumber = classNumber;
    }
    public int getClassNumber(){
        return classNumber;
    }

    public void setTeacherNumber(int teacherNumber){
        this.teacherNumber = teacherNumber;
    }
    public int getTeacherNumber(){
        return teacherNumber;
    }
}
