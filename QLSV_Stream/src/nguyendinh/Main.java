package nguyendinh;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in)
            );

            QuanLySinhVien ql = new QuanLySinhVien();
            int choice;

            do {
                System.out.println("\n===== MENU =====");
                System.out.println("1. Them sinh vien");
                System.out.println("2. Hien thi danh sach");
                System.out.println("3. Diem trung binh");
                System.out.println("4. Sinh vien diem cao nhat");
                System.out.println("5. Tim theo ten");
                System.out.println("6. Thoat");
                System.out.print("Chon: ");

                choice = Integer.parseInt(br.readLine());

                switch (choice) {
                    case 1:
                        System.out.print("Nhap ten: ");
                        String ten = br.readLine();

                        System.out.print("Nhap tuoi: ");
                        int tuoi = Integer.parseInt(br.readLine());

                        System.out.print("Nhap diem: ");
                        double diem = Double.parseDouble(br.readLine());

                        SinhVien sv = new SinhVien(ten, tuoi, diem);
                        ql.themSinhVien(sv);

                        System.out.println("=> Da them!");
                        break;

                    case 2:
                        ql.hienThiDanhSach();
                        break;

                    case 3:
                        System.out.println("Diem TB: " + ql.tinhDiemTB());
                        break;

                    case 4:
                        SinhVien max = ql.timMax();
                        if (max != null) {
                            System.out.println("Sinh vien diem cao nhat:");
                            max.hienThi();
                        } else {
                            System.out.println("Danh sach rong!");
                        }
                        break;

                    case 5:
                        System.out.print("Nhap ten can tim: ");
                        String keyword = br.readLine();
                        ql.timTheoTen(keyword);
                        break;

                    case 6:
                        System.out.println("Thoat...");
                        break;

                    default:
                        System.out.println("Lua chon khong hop le!");
                }

            } while (choice != 6);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}