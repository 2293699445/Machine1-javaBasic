package ItHeiMa.employee;

public class Cooker extends Employee{

    //
    public Cooker() {

    }
    public Cooker(String id, String name, double salary) {
        super(id, name, salary);
    }

    //
    @Override
    public void workhard(){
        System.out.println("炒菜");
    }

}
