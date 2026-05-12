package ntu.nguyendinh;

import java.util.List;

public class MainQuanLySinhVien {
    public static void main(String[] args) {

        QuanLySinhVien ql = new QuanLySinhVien();

        ql.themSinhVien(new SinhVien("SV001", "Nguyen Van A", 8.5));
        ql.themSinhVien(new SinhVien("SV002", "Tran Thi B", 7.2));
        ql.themSinhVien(new SinhVien("SV003", "Le Van C", 6.8));
        ql.themSinhVien(new SinhVien("SV004", "Pham Thi D", 9.1));
        ql.themSinhVien(new SinhVien("SV005", "Hoang Van E", 5.5));

        System.out.println("Danh sach:");
        ql.hienThi();

        System.out.println("\nTim SV003:");
        SinhVien sv = ql.timTheoMa("SV003");
        System.out.println(sv != null ? sv : "Khong tim thay");

        System.out.println("\nDiem cao nhat:");
        System.out.println(ql.timDiemCaoNhat());

        System.out.println("\nDiem TB lop:");
        System.out.println(ql.tinhDiemTB());

        System.out.println("\nSV diem >= 8:");
        List<SinhVien> ds = ql.locTheoDiem(8.0);
        for (SinhVien s : ds) {
            System.out.println(s);
        }

        System.out.println("\nSau khi sap xep:");
        ql.sapXep();
        ql.hienThi();

        System.out.println("\nXoa SV002:");
        ql.xoa("SV002");
        ql.hienThi();
    }
}