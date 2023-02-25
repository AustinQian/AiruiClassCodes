package com.iweb.tongda64.method.OfflineWeek1.Day3Eve.ObjectWork;

/**
 * @author ubunt on 2/23/2023.
 * @project Day3
 */
public class Rose extends Flower{
    private String Origin;

    public Rose(String origin) {
        Origin = origin;
    }

    public Rose() {
    }

    public String getOrigin() {
        return Origin;
    }

    public void setOrigin(String origin) {
        Origin = origin;
    }

    @Override
    public void showInfo(){
        super.showInfo();
        System.out.print("玫瑰的产地是："+Origin);
    }

    public void warn(){
        System.out.println("不要摘玫瑰花，小心扎手！");
    }
}
