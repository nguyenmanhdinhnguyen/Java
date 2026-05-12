package Java.BT2_TinhLuong;

import java.util.Scanner;

public class tinhluong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap so gio lam: ");
        double gioLam = sc.nextDouble();

        System.out.print("Nhap luong theo gio: ");
        double luongGio = sc.nextDouble();

        double tongLuong;

        if (gioLam <= 40) {
            tongLuong = gioLam * luongGio;
        } else {
            tongLuong = (40 * luongGio) + ((gioLam - 40) * luongGio * 1.5);
        }

        System.out.println("Tong luong nhan vien: " + tongLuong);

        sc.close();
    }
}