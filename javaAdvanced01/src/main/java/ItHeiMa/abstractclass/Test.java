package ItHeiMa.abstractclass;

public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        Student s1 = new Student(12,"于亮");
        Student s2 = (Student) s1.clone();
        System.out.println(s1);
        System.out.println(s2);
    }
}
