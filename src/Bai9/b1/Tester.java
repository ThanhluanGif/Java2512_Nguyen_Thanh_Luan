package Bai9.b1;

public class Tester extends Employee {
    private int bugsFound;

    public Tester(String id, String name, double baseSalary, int bugsFound) {
        super(id, name, baseSalary);
        this.bugsFound = bugsFound;
    }

    public int getBugsFound() { return bugsFound; }
    public void setBugsFound(int bugsFound) { this.bugsFound = bugsFound; }

    @Override
    public void doWork() {
        System.out.println(name + " is testing and found " + bugsFound + " bugs.");
    }

    @Override
    public double calculateSalary() {
        return baseSalary + (bugsFound * 100000.0);
    }

    @Override
    public String toString() {
        return "Tester{id='" + id + "', name='" + name + "', baseSalary=" + baseSalary
                + ", bugsFound=" + bugsFound
                + ", salary=" + calculateSalary()
                + "}";
    }
}
