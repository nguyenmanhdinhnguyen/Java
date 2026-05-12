package ntu.nguyendinh;

public class Main {
    public static void main(String[] args) {

        QuanLySanPham ql = new QuanLySanPham();

        // Thêm sp
        ql.themSanPham(new SanPham("SP01", "Laptop", 15000, 5));
        ql.themSanPham(new SanPham("SP02", "Chuot", 200, 50));
        ql.themSanPham(new SanPham("SP03", "Ban phim", 500, 8));

        System.out.println("=== Danh sách sản phẩm ===");
        ql.hienThiTatCa();

        System.out.println("\n=== Tìm 'lap' ===");
        ql.timTheoTen("lap");

        System.out.println("\n=== Sắp xếp tăng dần ===");
        ql.sapXepTang();
        ql.hienThiTatCa();

        System.out.println("\n=== Tổng giá trị kho ===");
        System.out.println(ql.tongGiaTri());

        System.out.println("\n=== Sản phẩm sắp hết hàng ===");
        ql.sapHetHang();
    }
}