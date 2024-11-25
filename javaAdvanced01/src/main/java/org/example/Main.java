package org.example;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Person p1 = new Student();
        System.out.println(p1 instanceof Student);
        Teacher t1 =(Teacher) p1;
        t1.teach();
        System.out.println(p1.age);
    }


}

class Person{
    int age=1;
    String name;

    public void sayHi(){
        System.out.println("你好呀");
    }

}

class Student extends Person{
    int age = 33;
    public void sayHi(){
        System.out.println("你好呀，我是一名学生");
    }
    public void study(){
        System.out.println("我会读书");
    }
}

class Teacher extends Person{
    public void teach(){
        System.out.println("我会教书");
    }
}



