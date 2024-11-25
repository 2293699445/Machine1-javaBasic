package ItHeiMa.polymorphism;

public class Dog extends Animal{

    //constructor 子类可以用父类的构造器
    public Dog() {

    }
    public Dog(int age, String color) {
        super(age,color);
    }

    //methods
    public void lookHome(){
        System.out.println("狗在看家");
    }
    @Override
    public void eat(String something) {
        System.out.println(getAge()+"岁的"+getColor()+"颜色的"+"狗两只前腿死死的抱住"+something+"猛吃");
    }

}
