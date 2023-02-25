package com.iweb.tongda64.method.OfflineWeek1.Day2.TestMethods;

/**
 * @author ubunt on 2/21/2023.
 * @project Day3
 */
public class TestMethod1 {
    public void change(Person person){
        person.age = 20;
        Person person1 = new Person();
        person1.age = 30;
        person = person1;
    }

    public static void main(String[] args) {
        Person person = new Person();
        TestMethod1 t = new TestMethod1();
        person.age = 10;
        System.out.println(person.age);
        t.change(person);
        System.out.println(person.age);
    }
}
