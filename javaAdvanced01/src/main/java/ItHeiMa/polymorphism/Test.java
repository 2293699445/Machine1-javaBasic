package ItHeiMa.polymorphism;

public class Test {

    public static void main(String[] args) {

        Dog dog = new Dog(2,"黑");
        Cat cat = new Cat(3,"灰");

        Person wang = new Person("老王",30);
        Person li = new Person("老李",25);

        wang.keepPet(dog,"骨头");
        li.keepPet(cat,"鱼");

    }

}
