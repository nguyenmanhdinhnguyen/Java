package Java.BT3_QuanLySinhVien;

public class SinhVien {
    private String maSV;
    private String tenSV;
    private double diem;

    public SinhVien(String maSV, String tenSV, double diem) {
        this.maSV = maSV;
        this.tenSV = tenSV;
        this.diem = diem;
    }

    public void hienThi() {
        System.out.println("Ma SV: " + maSV);
        System.out.println("Ten SV: " + tenSV);
        System.out.println("Diem: " + diem);
        System.out.println("---------------------");
    }
}