package Java.BT4_SanPham;

public class MainSanPham {
    public static void main(String[] args) {

        SanPham sp1 = new SanPham("SP01", "Laptop", 15000000, 2);
        SanPham sp2 = new SanPham();

        sp2.setMaSP("SP02");
        sp2.setTenSP("Chuột");
        sp2.setGia(200000);
        sp2.setSoLuong(5);

        System.out.println("Thong tin san pham 1:");
        sp1.hienThiThongTin();

        System.out.println();

        System.out.println("Thong tin san pham 2:");
        sp2.hienThiThongTin();
    }
}