package Bai9.b1;

public class Main {
    public static void main(String[] args) {
        Developer dev = new Developer(
                "D01",
                "An",
                10000000,
                new String[]{"Java", "Spring", "SQL"}
        );

        Tester tester = new Tester(
                "T01",
                "Binh",
                8000000,
                15
        );

        dev.doWork();
        tester.doWork();

        System.out.println("Developer salary: " + dev.calculateSalary());
        System.out.println("Tester salary: " + tester.calculateSalary());

        System.out.println(dev);
        System.out.println(tester);
    }
}
