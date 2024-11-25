package ItHeiMa.collection;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Consumer;

public class CollectionTest {
    public static void main(String[] args) {
        Collection<String> list = new ArrayList<>();
        ArrayList<String> list1 = new ArrayList<>();
        list.add("张三");
        list.add("李四");
        list.add("王五");

        // itrator
//        Iterator<String> itr = list.iterator();
//        while(itr.hasNext()) {
//            System.out.println(itr.next());
//        }

        //enhanced for
//        for(String s : list){
//            System.out.println(s);
//        }

        //lambda expression
        list.forEach(new Consumer<String>(){
            public void accept(String t){
                System.out.println(t);
            }
        });
        list.forEach(s-> System.out.println(s));

    }
}
