package Bai9.b1;
import java.util.Arrays;

public class Developer extends Employee {
    private String[] skills;

    public Developer(String id,String name, double baseSalary, String[] skills) {
        super(id,name,baseSalary);
        this.skills = skills;
    }
    public String[] getSkills() {
        return skills;
    }
    public void setSkills(String[] skills) {
        this.skills = skills;
    }
    @Override
    public void doWork() {
        System.out.println(name + " is coding with skills: " + Arrays.toString(skills));
    }
    @Override
    public double calculateSalary() {
        return baseSalary*1.5;
    }

    @Override
    public String toString() {
        return "Developer{id='" + id + "', name='" + name + "', baseSalary=" + baseSalary
                + ", skills=" + Arrays.toString(skills)
                + ", salary=" + calculateSalary()
                + "}";
    }
}
