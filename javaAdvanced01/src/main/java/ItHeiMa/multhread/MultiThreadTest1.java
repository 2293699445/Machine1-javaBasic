package ItHeiMa.multhread;

public class MultiThreadTest1 {
    /* 多线程
     * 1.多线程的三种实现方式
     *   （1）继承Thread类
     *   （2）实现Runnable接口
     *   （3）Callable和Future接口
     * 2.Thread中的成员方法
     *   （1）String getName()
     *   （2）void setName()
     *   （3）static Thread currentThread(): 哪条线程执行到这个方法，就返回哪个线程的对象
     *   （4）static void sleep(long time)
     *   （5）setPriority(int newPriority)
     *   （6）final int getPriority
     *   （7）final void setDaemon(boolean on)：设置为守护线程
     *   （8）public static void yield()：礼让线程
     *   (9)public static void join()：插入线程/插队线程
     * */
    public static void main(String[] args) {
        //Thread线程要执行的任务
        MyThread mt = new MyThread();
        //创建线程对象
        Thread t1 = new Thread(mt,"王八");
        Thread t2 = new Thread(mt,"乌龟");

//        Thread t = Thread.currentThread();
//        System.out.println(t);
        //设置线程优先级(java是抢占式调度，通过设置线程的优先级，使某个线程获得CPU的几率更高or更低)
        t1.setPriority(1);
        t2.setPriority(10);
        //启动线程
        t1.start();
        t2.start();
    }
}
