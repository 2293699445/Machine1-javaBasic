package ItHeiMa.employee;

public class Employee {
    //
    private String id;
    private String name;
    private double salary;

    //
    public void workhard(){
        System.out.println("管理员工");
    }
    public void eat(){
        System.out.println("饿了，吃点米饭");
    }

    //
    public Employee(){

    }
    public Employee(String id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    //
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

}
