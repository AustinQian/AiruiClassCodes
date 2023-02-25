package com.iweb.tongda64.method.OfflineWeek1.Day3M.QuizDemo;

/**
 * @author ubunt on 2/22/2023.
 * @project Day3
 */
public class Emp {
    private int id;
    private String name;
    private double Sal;
    private int DeptNo;

    public Emp() {
    }

    public Emp(int id, String name, double sal, int deptNo) {
        this.id = id;
        this.name = name;
        Sal = sal;
        DeptNo = deptNo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSal() {
        return Sal;
    }

    public void setSal(double sal) {
        Sal = sal;
    }

    public int getDeptNo() {
        return DeptNo;
    }

    public void setDeptNo(int deptNo) {
        DeptNo = deptNo;
    }

    public void work(String name){
        this.name = name;
        System.out.println(name+"正在工作!");
    }
    public void showInfo(){
        System.out.println("姓名："+name+"部门号："+DeptNo+"员工号："+id+"工资是："+Sal);
    }

}
