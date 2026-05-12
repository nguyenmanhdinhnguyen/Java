package Java.BT4_NhanVien;

public class NhanVien {
    private String maNV;
    private String hoTen;
    private double luongCoBan;
    private double heSoLuong;

    public NhanVien(String maNV, String hoTen, double luongCoBan, double heSoLuong) {
        this.maNV = maNV;
        this.hoTen = hoTen;
        this.luongCoBan = luongCoBan;
        this.heSoLuong = heSoLuong;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public double getLuongCoBan() {
        return luongCoBan;
    }

    public void setLuongCoBan(double luongCoBan) {
        this.luongCoBan = luongCoBan;
    }

    public double getHeSoLuong() {
        return heSoLuong;
    }

    public void setHeSoLuong(double heSoLuong) {
        this.heSoLuong = heSoLuong;
    }

    public double tinhLuong() {
        return luongCoBan * heSoLuong;
    }

    public String xepLoai() {
        double luong = tinhLuong();

        if (luong >= 20000000) {
            return "Xuat sac";
        } else if (luong >= 15000000) {
            return "Tot";
        } else {
            return "Kha";
        }
    }

    public void hienThiThongTin() {
        System.out.println("Ma NV: " + maNV);
        System.out.println("Ho Ten: " + hoTen);
        System.out.println("Luong: " + tinhLuong());
        System.out.println("Xep Loai: " + xepLoai());
    }
}
