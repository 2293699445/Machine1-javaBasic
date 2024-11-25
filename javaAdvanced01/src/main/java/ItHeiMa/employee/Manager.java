package ItHeiMa.employee;

public class Manager extends Employee{
    //
    private double managerSalary;

    //
    public Manager(){

    }
    public Manager(String firstName, String lastName, int employeeID, double salary){

    }

    //
    public double getManagerSalary() {
        return managerSalary;
    }

    public void setManagerSalary(double managerSalary) {
        this.managerSalary = managerSalary;
    }


}
