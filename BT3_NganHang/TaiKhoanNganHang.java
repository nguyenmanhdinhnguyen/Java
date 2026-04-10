package Java.BT3_NganHang;

public class TaiKhoanNganHang {
    String soTaiKhoan;
    String tenChuTaiKhoan;
    double soDu;

    public TaiKhoanNganHang(String soTaiKhoan, String tenChuTaiKhoan, double soDu) {
        this.soTaiKhoan = soTaiKhoan;
        this.tenChuTaiKhoan = tenChuTaiKhoan;
        this.soDu = soDu;
    }

    void guiTien(double soTien) {
        if (soTien > 0) {
            soDu += soTien;
            System.out.println("Da gui " + soTien);
        }
    }

    void rutTien(double soTien) {
        if (soTien <= soDu) {
            soDu -= soTien;
            System.out.println("Da rut " + soTien);
        } else {
            System.out.println("Khong du tien");
        }
    }

    void hienThi() {
        System.out.println("So TK: " + soTaiKhoan);
        System.out.println("Chu TK: " + tenChuTaiKhoan);
        System.out.println("So du: " + soDu);
    }
}
