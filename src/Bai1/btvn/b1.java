package Bai1.btvn;

import java.util.Scanner;

public class b1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student st1 = Student.nhapThongtin(sc);
        float dtb1 = st1.tinhDiemtrungbinh();
        System.out.println("Diem trung binh: " + dtb1);

        System.out.println("Xep loai: " + st1.xepLoai());

        Student st2 = Student.nhapThongtin(sc);
        float dtb2 = st2.tinhDiemtrungbinh();
        System.out.println("Diem trung binh: " + dtb2);

        System.out.println("Xep loai: " + st2.xepLoai());

        if (dtb1 > dtb2) {
            System.out.println("Diem trung binh " + st1.tenSinhvien + " cao hon diem trung binh " + st2.tenSinhvien);
        }else if (dtb1 == dtb2) {
            System.out.println("Diem trung binh " + st1.tenSinhvien + " bang diem trung binh " + st2.tenSinhvien);
        }
        else{
            System.out.println("Diem trung binh " + st2.tenSinhvien + " cao hon diem trung binh " + st1.tenSinhvien);
        }
        // Không close sc nếu môi trường cần dùng tiếp; bài đơn giản có thể close:
        sc.close();
    }

    public static class Student {
        //        tạo thuộc tính
        private String maSinhvien;
        private String tenSinhvien;
        private float diemToan;
        private float diemVan;

        //        tạo contructor
        public Student(String maSinhvien, String tenSinhvien, float diemToan, float diemVan) {
            this.maSinhvien = maSinhvien;
            this.tenSinhvien = tenSinhvien;
            this.diemToan = diemToan;
            this.diemVan = diemVan;
        }

        public String getMaSinhvien() {
            return maSinhvien;
        }

        public void setMaSinhvien(String maSinhvien) {
            this.maSinhvien = maSinhvien;
        }

        public String getTenSinhvien() {
            return tenSinhvien;
        }

        public void setTenSinhvien(String tenSinhvien) {
            this.tenSinhvien = tenSinhvien;
        }

        public float getDiemToan() {
            return diemToan;
        }

        public void setDiemToan(float diemToan) {
            this.diemToan = diemToan;
        }

        public float getDiemVan() {
            return diemVan;
        }

        public void setDiemVan(float diemVan) {
            this.diemVan = diemVan;
        }

        public static Student nhapThongtin(Scanner sc) {
            System.out.print("Ma sinh vien: ");
            String maSinhvien = sc.nextLine();

            System.out.print("Ten sinh vien: ");
            String tenSinhvien = sc.nextLine();

            System.out.print("Diem Toan: ");
            float diemToan = sc.nextFloat();

            System.out.print("Diem Van: ");
            float diemVan = sc.nextFloat();
            sc.nextLine(); // bỏ Enter còn dư

            return new Student(maSinhvien, tenSinhvien, diemToan, diemVan);
        }

        public float tinhDiemtrungbinh() {
            return (diemToan + diemVan) / 2;
        }

        public String xepLoai() {
            float dtb = tinhDiemtrungbinh();
            if (dtb >= 8.0) {
                return "Sinh vien dat loai gioi";
            } else if (dtb < 8 && dtb >= 6.5) {
               return  "Sinh vien dat loai kha";
            } else
                return "Sinh vien dat loai trung binh";
        }
    }
}
