package nguyendinh;

import java.util.*;

public class QuanLySinhVien {
    private ArrayList<SinhVien> list = new ArrayList<>();

    // Thêm sinh viên
    public void themSinhVien(SinhVien sv) {
        list.add(sv);
    }

    // Hiển thị danh sách
    public void hienThiDanhSach() {
        if (list.isEmpty()) {
            System.out.println("Danh sach rong!");
            return;
        }

        for (SinhVien sv : list) {
            sv.hienThi();
        }
    }

    // Tính điểm trung bình
    public double tinhDiemTB() {
        if (list.isEmpty()) return 0;

        double sum = 0;
        for (SinhVien sv : list) {
            sum += sv.getDiem();
        }
        return sum / list.size();
    }

    // Tìm sinh viên điểm cao nhất
    public SinhVien timMax() {
        if (list.isEmpty()) return null;

        SinhVien max = list.get(0);
        for (SinhVien sv : list) {
            if (sv.getDiem() > max.getDiem()) {
                max = sv;
            }
        }
        return max;
    }

    // Tìm theo tên
    public void timTheoTen(String keyword) {
        boolean found = false;

        for (SinhVien sv : list) {
            if (sv.getTen().toLowerCase().contains(keyword.toLowerCase())) {
                sv.hienThi();
                found = true;
            }
        }

        if (!found) {
            System.out.println("Khong tim thay!");
        }
    }
}