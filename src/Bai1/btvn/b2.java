package Bai1.btvn;

import java.util.Scanner;

public class b2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Account ac1 = Account.createAccount(sc);
        System.out.println("So tien can nap: ");
        double nap = sc.nextDouble();
        ac1.deposit(amount);

        System.out.println("So du hien tai: " + ac1.getBalance());

    }
    public static class Account{
        private String name;
        private String accountNumber;
        private static double balance;

        public Account(String name, String accountNumber, double balance) {
            this.name = name;
            this.accountNumber = accountNumber;
            this.balance = balance;
        }
        public String getName() {return name;}
        public String getAccountNumber() {return accountNumber;}
        public double getBalance() {return balance;}

        public void setName(String name) {this.name = name;}
        public void setAccountNumber(String accountNumber) {this.accountNumber = accountNumber;}
        public void setBalance(double balance) {this.balance = balance;}

        public static Account createAccount(Scanner sc) {
            String name = sc.nextLine();
            String accountNumber = sc.nextLine();
            double balance = 0;
            return new Account(name, accountNumber, balance);
        }
        public static void deposit(double amount) {
            if (amount < 0) {
                System.out.println("Vui long nhap so lon hon 0");
                return;
            }
            balance += amount;
            System.out.println("Nap tien thanh cong");
        }
        public static void withdraw(double amount) {
            if (amount < 0) {
                System.out.println("Vui long nhap so lon hon 0");
                return;
            }
            if (amount > balance) {
                System.out.println("So du khong du");
            }
            balance -= amount;
            System.out.println("Rut tien thanh cong");

        }
        public static void displayInfo(String accountNumber, double balance, ) {

        }
    }
}
