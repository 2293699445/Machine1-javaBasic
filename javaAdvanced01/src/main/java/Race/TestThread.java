package Race;

public class TestThread {
    public static void main(String[] args) {
        //线程1
        RabbitThread rt = new RabbitThread();
        rt.start();
        rt.setName("Rabbit");
        //线程2
        TortoiseThread tt = new TortoiseThread();
        tt.start();
        tt.setName("Tortoise");


    }
}
