package nguyendinh;1

public class SinhVien {
    private String ten;
    private int tuoi;
    private double diem;

    public SinhVien(String ten, int tuoi, double diem) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.diem = diem;
    }

    public String getTen() {
        return ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public double getDiem() {
        return diem;
    }

    public void hienThi() {
        System.out.println(ten + " - " + tuoi + " - " + diem);
    }
}