package Bai1.btvn;

import java.util.Scanner;

public class b2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Tạo 1 đối tượng Account (cho phép chọn khởi tạo balance = 0 hoặc nhập)
        System.out.print("Nhap ten chu tai khoan: ");
        String name = sc.nextLine();

        System.out.print("Nhap so tai khoan: ");
        String accountNumber = sc.nextLine();

        System.out.print("Ban co muon nhap so du ban dau khong? (y/n): ");
        String choiceInit = sc.nextLine();

        int initBalance = 0;
        if (choiceInit.equalsIgnoreCase("y")) {
            System.out.print("Nhap so du ban dau: ");
            initBalance = sc.nextInt();
            sc.nextLine(); // bo Enter
            if (initBalance < 0) initBalance = 0; // an toan
        }

        Account acc = new Account(name, accountNumber, initBalance);

        int choice;
        do {
            System.out.println("\n===== MENU TAI KHOAN =====");
            System.out.println("1. Nap tien");
            System.out.println("2. Rut tien");
            System.out.println("3. Xem thong tin");
            System.out.println("4. Thoat");
            System.out.print("Chon: ");

            choice = sc.nextInt();
            sc.nextLine(); // bo Enter

            switch (choice) {
                case 1: {
                    System.out.print("Nhap so tien can nap: ");
                    int amount = sc.nextInt();
                    sc.nextLine();
                    acc.deposit(amount);
                    break;
                }
                case 2: {
                    System.out.print("Nhap so tien can rut: ");
                    int amount = sc.nextInt();
                    sc.nextLine();
                    acc.withdraw(amount);
                    break;
                }
                case 3:
                    acc.displayInfo();
                    break;
                case 4:
                    System.out.println("Da thoat chuong trinh.");
                    break;
                default:
                    System.out.println("Lua chon khong hop le. Vui long chon lai!");
            }

        } while (choice != 4);

        sc.close();
    }

    // Class Account
    public static class Account {
        private String name;
        private String accountNumber;
        private int balance; // theo de: deposit(int), withdraw(int)

        // balance có thể mặc định 0 hoặc nhập từ bàn phím (đang hỗ trợ qua constructor)
        public Account(String name, String accountNumber, int balance) {
            this.name = name;
            this.accountNumber = accountNumber;
            this.balance = Math.max(balance, 0);
        }

        // 1) deposit(int amount): nạp tiền
        public void deposit(int amount) {
            if (amount <= 0) {
                System.out.println("So tien nap phai > 0");
                return;
            }
            balance += amount;
            System.out.println("Nạp thành công. Số dư mới: " + balance);
        }

        // 2) withdraw(int amount): rút tiền
        public void withdraw(int amount) {
            if (amount <= 0) {
                System.out.println("So tien rut phai > 0");
                return;
            }
            if (amount > balance) {
                System.out.println("Số dư không đủ");
                return;
            }
            balance -= amount;
            System.out.println("Rút thành công. Số dư mới: " + balance);
        }

        // 3) displayInfo(): hiển thị thông tin
        public void displayInfo() {
            System.out.println("\n--- THONG TIN TAI KHOAN ---");
            System.out.println("Ten chu tai khoan: " + name);
            System.out.println("So tai khoan: " + accountNumber);
            System.out.println("So du hien tai: " + balance);
        }
    }
}
