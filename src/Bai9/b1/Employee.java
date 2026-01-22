package Bai9.b1;

public abstract class Employee implements IWorkable {
    protected String id;
    protected String name;
    protected double baseSalary;

    public Employee(String id, String name, double baseSalary) {
        this.id = id;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public String getId() {return id;}
    public String getName() {return name;}
    public double getBaseSalary() {return baseSalary;}

    public void setBaseSalary(double baseSalary) {this.baseSalary = baseSalary;}

    public abstract double calculateSalary();

    @Override
    public String toString() {
        return "Employee{id='" + id + "', name='" + name + "', baseSalary=" + baseSalary + "}";
    }
}
