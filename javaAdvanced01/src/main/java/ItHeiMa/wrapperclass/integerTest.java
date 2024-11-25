package ItHeiMa.wrapperclass;

public class integerTest {
    public static void main(String[] args) {
        //自动装箱
        Integer i = Integer.valueOf(3);
        System.out.println(i instanceof Integer);
        System.out.println(i);
        int is = i.intValue();
        System.out.println(is);

        Double d = Double.valueOf(3.14);
        System.out.println(d.doubleValue());
    }
}
