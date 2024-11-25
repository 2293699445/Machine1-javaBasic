package ItHeiMa.collection;
import java.util.*;
import java.util.function.BiConsumer;

public class mapTest {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("stu1","1001");
        map.put("stu2","1002");
        map.put("stu3","1003");
        map.put("stu4","1004");
        map.put("stu5","1005");
        //lambda表达式遍历map集合
        map.forEach((String k, String v)-> System.out.println(k+":"+v));
    }
}
