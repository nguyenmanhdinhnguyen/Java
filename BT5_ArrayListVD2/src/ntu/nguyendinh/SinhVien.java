package ntu.nguyendinh;

public class SinhVien {
    private String maSV;
    private String hoTen;
    private double diemTB;

    public SinhVien(String maSV, String hoTen, double diemTB) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.diemTB = diemTB;
    }

    public String getMaSV() {
        return maSV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public double getDiemTB() {
        return diemTB;
    }

    @Override
    public String toString() {
        return "MaSV: " + maSV + ", Ten: " + hoTen + ", DiemTB: " + diemTB;
    }
}