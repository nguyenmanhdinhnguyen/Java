package Java.BT3_NganHang;

public class MainNganHang {
    public static void main(String[] args) {

        TaiKhoanNganHang tk1 = new TaiKhoanNganHang("123", "Nguyen Van A", 5000000);
        TaiKhoanNganHang tk2 = new TaiKhoanNganHang("456", "Tran Thi B", 2000000);

        System.out.println("Trang thai ban dau:");
        tk1.hienThi();
        tk2.hienThi();

        tk1.guiTien(1000000);
        tk1.rutTien(2000000);

        System.out.println("Sau giao dich:");
        tk1.hienThi();
        tk2.hienThi();
    }
}