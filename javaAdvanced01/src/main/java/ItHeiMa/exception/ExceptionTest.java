package ItHeiMa.exception;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ExceptionTest {
    /* 异常的三种处理方式
    * 1. JVM默认处理异常：异常信息直接打印在控制台，终止程序
    * 2. try...catch：方法调用者去处理异常，用在方法的调用处，不会终止程序
    * 3. throws和throw
    *   throws：方法定义处使用，告知运行该方法可能会出现的异常（注：编译时异常必须写，运行时异常可以不写）
    *   throw：方法内部使用，结束方法，手动抛出异常对象，交给调用者
    * */
    /* 灵魂四问
    * 1.如果try中没有遇到问题，怎么执行？
    *   catch捕获不到异常，不会执行catch中的内容
    * 2.如果try中可能会遇到多个问题，怎么执行？
    *   需要catch捕捉各种异常
    * 3.如果try中遇到的问题没有被捕获，怎么执行？
    *   会把异常交给jvm处理，将异常信息输出在控制台，并结束代码
    * 4.如果try中遇到了问题，那么try下面的其他代码还会执行么？
    *   try下面的代码不会再接着执行，try中一旦捕获到异常后会执行catch中的内容，整个try-catch结束
    * */
    /* 自定义异常
    * 1.自定义一个异常类
    * 2.继承父类异常，Exception or RuntimeException
    * 3.空参构造和有参构造
    * */
    public static void main(String[] args) {
        //new对象
       GirlFriend girl1 = new GirlFriend();
       Scanner sc = new Scanner(System.in);

       //名字：长度是3-10个字符
        //年龄：范围是18-40；不能输入非数字；
       while(true){
           try{
               System.out.print("请输入女朋友的名字：");
               String name = sc.nextLine();
               girl1.setName(name);
               System.out.print("请输入女朋友的年纪：");
               String strAge = sc.nextLine();
               int age = Integer.parseInt(strAge);
               girl1.setAge(age);
               break;
           }catch(NumberFormatException e){
               e.printStackTrace();
           }catch(NameFormatException e){
               e.printStackTrace();
           }catch(AgeOutOfBoundsException e){
               e.printStackTrace();
           }
       }
        System.out.println(girl1);
    }


}
