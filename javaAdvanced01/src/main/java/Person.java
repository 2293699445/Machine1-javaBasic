class TravelException extends Exception{

    public TravelException(){
    }

    public TravelException(String message){
        super(message);
    }

}


public class Person {
    public static void main(String[] args) throws TravelException{
        Travel t1 = new Travel();
        try{
            t1.buyTickets(107,"于亮");
        }catch(TravelException e){
            System.out.println(e.getMessage());
        }
    }
}

class Travel {

    private int ticketsAmount = 105;

    public void buyTickets(int num,String name) throws TravelException{
        if(num<=ticketsAmount){
            ticketsAmount -= num;
            System.out.println("剩余票数："+ticketsAmount);
        }else {
            throw new TravelException("票已不足，无法购买！");
        }
    }

}




