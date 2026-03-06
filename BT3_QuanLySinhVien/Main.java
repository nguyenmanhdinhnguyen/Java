package Java.BT3_QuanLySinhVien;

public class Main {
    public static void main(String[] args) {

        SinhVien[] ds = new SinhVien[3];

        ds[0] = new SinhVien("SV01", "An", 8.5);
        ds[1] = new SinhVien("SV02", "Binh", 7.0);
        ds[2] = new SinhVien("SV03", "Chi", 9.0);

        System.out.println("Danh sach sinh vien:");

        for(int i = 0; i < ds.length; i++) {
            ds[i].hienThi();
        }
    }
}