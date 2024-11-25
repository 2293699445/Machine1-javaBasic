package ItHeiMa.polymorphism;

public class Cat extends Animal {
    //

    //constructor
    public Cat() {

    }
    public Cat(int age,String color) {
        super(age,color);
    }

    //methods
    public void catchMouse() {
        System.out.println("猫在抓老鼠");
    }
    @Override
    public void eat(String something) {
        System.out.println(getAge()+"岁的"+getColor()+"颜色的"+"猫眯着眼睛侧着头吃"+something);
    }


}
