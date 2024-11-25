package ItHeiMa.stream;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;


public class StreamTest1 {
    public static void main(String[] args) {
        /*
        * 1.Stream流的作用
        *   作用：结合lambda表达式简化代码
        *   //初爽Stream流---lambda写法
            list.stream().filter(s -> s.startsWith("张") && s.length()==3).forEach(s->list2.add(s)); //return true 代表保存这个数据，false表示过滤这个数据
        * 2.获取Stream流的方法---step1
        *   （1）单列集合Collection: Collection中的默认方法 stream()
        *       list.stream().filter(s -> s.startsWith("张") && s.length()==3).forEach(s->list2.add(s)); //return true 代表保存这个数据，false表示过滤这个数据
        *   （2）双列集合Map: 先用keySet or entrySet转换成单列，再获取流。
        *       ArrayList<String> list = new ArrayList<>();
        *       Set<String> key = treeMap.keySet();
                key.forEach(s-> list.add(s+"="+treeMap.get(s)));
                list.stream();
                treeMap.entrySet().stream();
        *   （3）数组: Arrays类中的静态方法
        *   （4）零散元素：Stream接口中的静态方法
        * 3.stream流中操作:中间方法---step2
        *   （1）filter()
        *   （2）limit()
        *   （3）skip()
        *   （4）toList()
        *   （5）map()
        *   （6）
        * 4.stream流结果：终结方法---step3
        *   (1)forEach()
        *   (2)
        *   (3)
        * 5.练习
        *   （1）
        *   （2）
        *   （3）
        * */

//        ArrayList<String> list = new ArrayList<>();
//        Collections.addAll(list,"张无忌","周芷若","赵敏","张强","张三丰");
//        ArrayList<String> list2 = new ArrayList<>();
        //遍历列表三种方式：迭代器，增强for，lambda表达式
        // 增强for
//        for(String s : list){
//            if(s.startsWith("张") && s.length()==3){
//                list2.add(s);
//            }
//        }
        // 迭代器
//        Iterator<String> iterator = list.iterator();
//        while(iterator.hasNext()){
//            String name = iterator.next();
//            if(name.startsWith("张") && name.length()==3){
//                list2.add(name);
//            }
//        }
        // lambda表达式
//        list.forEach(new Consumer<String>() {
//            public void accept(String t){
//                if(t.startsWith("张") && t.length()==3){
//                list2.add(t);
//                }
//            }
//        });
//        list.forEach(t -> {
//            if(t.startsWith("张") && t.length()==3){
//                list2.add(t);
//            }
//        });
//        System.out.println(list2);


        //初爽Stream流---无lambda写法
//        list.stream().filter(new Predicate<String>() {
//            public boolean test(String s) {  //s是流中的每个元素
//                return s.startsWith("张") && s.length()==3; //return true 代表保存这个数据，false表示过滤这个数据
//            }
//        }).forEach(s->list2.add(s));

//        TreeMap<String,String> treeMap = new TreeMap();
//        treeMap.put("张无忌", "37");
//        treeMap.put("周芷若", "28");
//        treeMap.put("赵敏", "33");
//        treeMap.put("张强", "48");
//        treeMap.put("张三丰","59");


//        String[] skill = {"eat","sleep","drink"};
//        String<String> s = Arrays.stream(skill);
    }
}
