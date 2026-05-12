package ntu.nguyendinh;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class QuanLySanPham {

    private ArrayList<SanPham> ds = new ArrayList<>();

    // 1. Thêm sp
    public void themSanPham(SanPham sp) {
        ds.add(sp);
    }

    // 2. Xóa sp
    public void xoaSanPham(String maSP) {
        ds.removeIf(sp -> sp.getMaSP().equalsIgnoreCase(maSP));
    }

    // 3. Tìm sp
    public void timTheoTen(String ten) {
        for (SanPham sp : ds) {
            if (sp.getTenSP().toLowerCase().contains(ten.toLowerCase())) {
                sp.hienThi();
            }
        }
    }

    // 4. Sắp xếp tăng dần
    public void sapXepTang() {
        Collections.sort(ds, Comparator.comparingDouble(SanPham::getGia));
    }

    // 5. Sắp xếp giảm dần
    public void sapXepGiam() {
        Collections.sort(ds, (a, b) -> Double.compare(b.getGia(), a.getGia()));
    }

    // 6. Tính tổng giá trị
    public double tongGiaTri() {
        double tong = 0;
        for (SanPham sp : ds) {
            tong += sp.getGia() * sp.getSoLuong();
        }
        return tong;
    }

    // 7. Liệt kê sản phẩm sắp hết hàng
    public void sapHetHang() {
        for (SanPham sp : ds) {
            if (sp.getSoLuong() < 10) {
                sp.hienThi();
            }
        }
    }

    // Hiển thị tất cả
    public void hienThiTatCa() {
        for (SanPham sp : ds) {
            sp.hienThi();
        }
    }
}