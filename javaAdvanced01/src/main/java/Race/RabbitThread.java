package Race;

public class RabbitThread extends Thread {
    public void run(){
        for(int i=1;i<=30;i++){
            System.out.println(Thread.currentThread().getName()+"跑了"+i+"米");
            if(i%10==0){
                try{
                    Thread.sleep(10000);
                }catch(InterruptedException e){
                    e.printStackTrace();
                }
            }
        }
    }

}
