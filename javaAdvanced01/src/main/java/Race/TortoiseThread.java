package Race;

public class TortoiseThread extends Thread {
    public void run(){
        for(int i=1;i<=30;i++){
            System.out.println(Thread.currentThread().getName()+"跑了"+i+"米");
            if(i%20==0){
                try{
                    Thread.sleep(100);
                }catch(InterruptedException e){
                    e.printStackTrace();
                }
            }
        }
    }
}
