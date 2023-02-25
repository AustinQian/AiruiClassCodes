package com.iweb.tongda64.method.Day5.InterfaceTest.MultiDemo;

/**
 * @author ubunt on 2/25/2023.
 * @project Day3
 */
public class Test {
    public static void main(String[] args) {
        Student student = new Student();
        //student从头到尾都是一个学生对象
        student.work();
        student.play();
        student.sleep();

        Person person = new Person();
        //person1从头到尾都是一个person对象
        person.work();//多态性，此时调用子类学生学习方法   学生状态
        person.play();
        person.sleep();

        Person person1 = new Student(); //编译看左边运行看右边 向上转型
        //person在work时是学生，其他时间是person
        person1.work();//多态性，此时调用子类学生学习方法   学生状态
        person1.play();
        person1.sleep();
        System.out.println(person1.num); //100向上找，如果父类没有num而子类有会报错。  编译看左边，运行看左边

        person1.show(); //成员方法：看new的是谁，就有限用谁，没有向上找。编译看左边，运行看左边
        //间接通过成员方法访问，看访问的是子类的还是父类的方法，访问子类，就调用子类，访问父类就调用父类。

        //静态方法：编译看左边，运行看左边
        Student student1 = (Student) person1; //向下转型
        student1.study();

    }
}
