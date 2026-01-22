package Bai9.b2;

import Bai9.b1.Developer;
import Bai9.b1.Employee;
import Bai9.b1.Tester;

import java.util.Scanner;

public class Main {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        runB2();
    }

    public static void runB2() {
        int N = readInt("Nhập số phòng ban N: ", 1);

        Employee[][] company = new Employee[N][];

        for (int dept = 0; dept < N; dept++) {
            try {
                int m = readInt("Nhập số nhân viên phòng ban " + (dept + 1) + ": ", 1);
                company[dept] = new Employee[m];

                for (int i = 0; i < m; i++) {
                    System.out.println("\n--- Nhập nhân viên " + (i + 1) + " (Phòng ban " + (dept + 1) + ") ---");

                    String id = readNonEmpty("ID: ");
                    String name = readNonEmpty("Name: ");

                    double baseSalary = readSalary("Base salary (>0): ");

                    int type = readInt("Chọn loại (1-Developer, 2-Tester): ", 1, 2);

                    if (type == 1) {
                        int skillCount = readInt("Số skills: ", 0);
                        String[] skills = new String[skillCount];
                        for (int s = 0; s < skillCount; s++) {
                            skills[s] = readNonEmpty("Skill " + (s + 1) + ": ");
                        }
                        company[dept][i] = new Developer(id, name, baseSalary, skills);
                    } else {
                        int bugsFound = readInt("Bugs found: ", 0);
                        company[dept][i] = new Tester(id, name, baseSalary, bugsFound);
                    }
                }

            } finally {
                printMemoryStatus("Sau khi nhập xong phòng ban " + (dept + 1));
            }
        }

        System.out.println("\n===== DANH SÁCH NHÂN VIÊN =====");
        for (int dept = 0; dept < company.length; dept++) {
            System.out.println("Phòng ban " + (dept + 1) + ":");
            for (Employee e : company[dept]) {
                System.out.println("  " + e + " | salary=" + e.calculateSalary());
            }
        }
    }

    // ---- Câu 6 + 7: nhập salary, sai thì nhập lại ----
    private static double readSalary(String prompt) {
        while (true) {
            try {
                System.out.print(prompt);
                String line = sc.nextLine().trim();
                double salary = Double.parseDouble(line);

                if (salary <= 0) {
                    throw new InvalidDataException("Lương phải > 0.");
                }
                return salary;

            } catch (NumberFormatException e) {
                System.out.println("Sai định dạng số. Vui lòng nhập lại (ví dụ: 10000000).");
            } catch (InvalidDataException e) {
                System.out.println("Dữ liệu không hợp lệ: " + e.getMessage() + " Nhập lại.");
            }
        }
    }

    private static int readInt(String prompt, int min) {
        while (true) {
            try {
                System.out.print(prompt);
                String line = sc.nextLine().trim();
                int x = Integer.parseInt(line);
                if (x < min) {
                    System.out.println("Giá trị phải >= " + min + ". Nhập lại.");
                    continue;
                }
                return x;
            } catch (NumberFormatException e) {
                System.out.println("Sai định dạng số nguyên. Nhập lại.");
            }
        }
    }

    private static int readInt(String prompt, int min, int max) {
        while (true) {
            int x = readInt(prompt, min);
            if (x > max) {
                System.out.println("Giá trị phải <= " + max + ". Nhập lại.");
                continue;
            }
            return x;
        }
    }

    private static String readNonEmpty(String prompt) {
        while (true) {
            System.out.print(prompt);
            String s = sc.nextLine().trim();
            if (!s.isEmpty()) return s;
            System.out.println("Không được để trống. Nhập lại.");
        }
    }

    private static void printMemoryStatus(String label) {
        Runtime rt = Runtime.getRuntime();
        long total = rt.totalMemory();
        long free = rt.freeMemory();
        long used = total - free;
        long max = rt.maxMemory();

        System.out.println("\n[MEMORY] " + label);
        System.out.println("  Used  = " + used + " bytes");
        System.out.println("  Free  = " + free + " bytes");
        System.out.println("  Total = " + total + " bytes");
        System.out.println("  Max   = " + max + " bytes\n");
    }
}
