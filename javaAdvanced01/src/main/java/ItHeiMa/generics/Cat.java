package ItHeiMa.generics;

public class Cat extends Animal {

    public Cat() {

    }

    public Cat(String name, int age){
        super(name, age);//调用父类带参构造器
    }

    @Override
    public void eat(String name, int age) {
        if(name.equals("小朵")){
            System.out.println("一只叫做"+name+"的，"+age+"岁的波斯猫，正在吃小饼干");
        }else{
            System.out.println("一只叫做"+name+"的，"+age+"岁的狸花猫，正在吃鱼");
        }
    }
}
