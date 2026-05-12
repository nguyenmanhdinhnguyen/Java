package Java.BT4_SanPham;

public class SanPham {
    private String maSP;
    private String tenSP;
    private double gia;
    private int soLuong;

    public SanPham() {
    }

    public SanPham(String maSP, String tenSP, double gia, int soLuong) {
        setMaSP(maSP);
        setTenSP(tenSP);
        setGia(gia);
        setSoLuong(soLuong);
    }

    public String getMaSP() {
        return maSP;
    }

    public void setMaSP(String maSP) {
        if (maSP != null && !maSP.isEmpty()) {
            this.maSP = maSP;
        } else {
            System.out.println("Ma san pham khong hop le");
        }
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        if (gia > 0) {
            this.gia = gia;
        } else {
            System.out.println("Gia phai lon hon 0");
        }
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        if (soLuong >= 0) {
            this.soLuong = soLuong;
        } else {
            System.out.println("So luong khong hop le");
        }
    }

    public double tinhThanhTien() {
        return gia * soLuong;
    }

    public void hienThiThongTin() {
        System.out.println("Ma SP: " + maSP);
        System.out.println("Ten SP: " + tenSP);
        System.out.println("Gia: " + gia);
        System.out.println("So luong: " + soLuong);
        System.out.println("Thanh tien: " + tinhThanhTien());
    }
}