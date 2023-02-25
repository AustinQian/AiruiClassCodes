package com.iweb.tongda64.method.Day5.InterfaceTest.ClassDemo;

/**
 * @author ubunt on 2/25/2023.
 * @project Day3
 */
public class UDisk implements USBInterface{
    @Override
    public void service(int se) {
        System.out.println("插入U盘，U盘开始工作");
    }
}
