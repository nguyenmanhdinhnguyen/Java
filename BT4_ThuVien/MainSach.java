package Java.BT4_ThuVien;

public class MainSach {
    public static void main(String[] args) {
        Sach s1 = new Sach("S01", "Lap trinh Java", "Nguyen Van A", 1998);

        s1.hienThiThongTin();

        s1.muonSach();
        s1.muonSach();

        s1.traSach();

        if (s1.kiemTraSachCu()) {
            System.out.println("Day la sach cu.");
        } else {
            System.out.println("Day la sach moi.");
        }
    }
}
