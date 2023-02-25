package com.iweb.tongda64.method.Day5.InterfaceTest.ClassDemo;

/**
 * @author ubunt on 2/25/2023.
 * @project Day3
 */
public class USBMouse implements USBInterface{
    @Override
    public void service(int se) {
        System.out.println("鼠标连接usb接口，可以工作了");
    }
}
