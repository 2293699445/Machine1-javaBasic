package ItHeiMa.polymorphism;

public class Animal {
    //property
    private int age;
    private String color;

    //constructor
    public Animal() {

    }
    public Animal(int age, String color) {
        this.age = age;
        this.color = color;
    }

    //getter and setter
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    //methods
    public void eat(String something) {
        System.out.println("在吃"+something);
    }
}
