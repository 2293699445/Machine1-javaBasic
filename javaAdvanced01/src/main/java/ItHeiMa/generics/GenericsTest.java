package ItHeiMa.generics;

import java.util.ArrayList;
import java.util.Iterator;

public class GenericsTest {

    public static void main(String[] args) {

        ArrayList<Dog> dogList = new ArrayList<>();
        ArrayList<Cat> catList = new ArrayList<>();

        Dog dog1 = new Dog("小黑",2);
        Dog dog2 = new Dog("小虎",1);
        Cat cat1 = new Cat("小狸",1);
        Cat cat2 = new Cat("小朵",3);

        dogList.add(dog1);
        dogList.add(dog2);
        catList.add(cat1);
        catList.add(cat2);

        keepPet(dogList);
//        keepPet(catList);

    }

    public static void keepPet(ArrayList<? extends Animal> list){
        //遍历集合，调用动物的eat方法
        Iterator i = list.iterator();
        while(i.hasNext()){
            Animal animal = (Animal)i.next(); //多态 狗-->动物
            animal.eat(animal.getName(),animal.getAge());
        }
    }
}
