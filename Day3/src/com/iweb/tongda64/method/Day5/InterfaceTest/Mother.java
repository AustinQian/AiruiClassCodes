package com.iweb.tongda64.method.Day5.InterfaceTest;

/**
 * @author ubunt on 2/25/2023.
 * @project Day3
 */
public interface Mother {
    //常量（默认所有成员属性都是常量public static final 类型 常量名 = 值）
    String name ="Jack";

    //接口中不能声明构造方法
    //public Mother();

    //成员方法
    //jdk1.7：只能是抽象方法
    //jdk1.8：可以定义default和static方法，为了让接口更易扩展，使接口更易扩展
    //jkd1.9：定义私有方法：这些私有方法将改善接口内部的代码可重用性。
    //例如，如果需要两个默认方法来共享代码，则私有接口方法将允许它们共享代码，但不将该私有方法暴露给它的实现类调用

    //抽象方法
    public abstract void sing();

    static void method(){
        System.out.println("mother method1");
    }
}
