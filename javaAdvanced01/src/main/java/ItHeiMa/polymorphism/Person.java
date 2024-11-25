package ItHeiMa.polymorphism;

public class Person {
    private String name;
    private int age;

    public Person() {

    }
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void keepPet(Animal animal,String something){
        if(animal instanceof Dog d){
            System.out.println("年龄为"+this.age+"岁的"+this.name+"养了一只"+animal.getColor()+"颜色的"+animal.getAge()+"岁的狗");
            animal.eat(something);
            d.lookHome();  //子类特有的方法，父类要调用只能强转
        }
        System.out.println("--------------------------------------------------");
        if(animal instanceof Cat c){
            System.out.println("年龄为"+this.age+"岁的"+this.name+"养了一只"+animal.getColor()+"颜色的"+animal.getAge()+"岁的猫");
            animal.eat(something);
            c.catchMouse();
        }
    }


}
