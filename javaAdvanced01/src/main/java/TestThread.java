public class TestThread {
    public static void main(String[] args) {
        //创建线程1
        oddThread odd = new oddThread();
        odd.start();  //调用start方法，会去执行对象的run方法
        //创建线程2
        evenThread even = new evenThread();
        even.start();
    }
}

class oddThread extends Thread {
    public void run() {   //线程被调度时要执行的操作
        for(int i=1;i<=100;i++){
            if(i%2!=0) System.out.println("奇数："+i);
        }
    }
}

class evenThread extends Thread {
    public void run() {
        for(int i=1;i<=100;i++){
            if(i%2==0) System.out.println("偶数数："+i);
        }
    }
}
