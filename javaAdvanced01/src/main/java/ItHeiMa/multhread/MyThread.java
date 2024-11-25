package ItHeiMa.multhread;

public class MyThread implements Runnable {
    //1.编写一个类继承Runnable
    //2.重写run方法，方面里面编写线程要执行的操作
    //3.
    public void run(){
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName()+"@:"+i);

        }
    }
}
