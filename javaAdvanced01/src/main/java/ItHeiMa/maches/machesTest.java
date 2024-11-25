package ItHeiMa.maches;

public class machesTest {
    public static void main(String[] args) {
        //userName
        String regex1 = "\\w{4,16}";
        //identityCard
        String regex2 = "\\d{17}[0-9Xx]]";
        System.out.println("ssfW_22".matches(regex1));
        System.out.println("11111100987654378x".matches(regex2));
    }
}
