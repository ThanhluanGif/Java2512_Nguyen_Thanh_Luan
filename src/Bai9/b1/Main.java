package Bai9.b1;
import java.util.Scanner;

public class Main {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        b1();
    }

    public static void b1() {
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

