package ItHeiMa.generics;

public class Dog extends Animal {
    public Dog(){

    }
    public Dog(String name,int age){
        super(name,age);  //调用父类带参构造器
    }
    @Override
    public void eat(String name, int age){
        if(name.equals("小黑")){
            System.out.println("一只叫做"+name+"的，"+age+"岁的哈士奇，正在吃骨头，边吃边拆家");
        }else{
            System.out.println("一只叫做"+name+"的，"+age+"岁的泰迪，正在吃骨头，边吃边蹭");
        }

    }
}
