package Java.BT4_MatPhang;

public class MainDiem {
    public static void main(String[] args) {

        Diem d1 = new Diem(3, 4);
        Diem d2 = new Diem(1, 2);

        System.out.println("Khoang cach: " + d1.tinhKhoangCach(d2));

        if (d1.kiemTraTrungNhau(d2)) {
            System.out.println("Hai diem trung nhau");
        } else {
            System.out.println("Hai diem khong trung nhau");
        }

        Diem dx = d1.doiXungQuaGoc();
        System.out.print("Diem doi xung cua d1: ");
        dx.hienThi();
    }
}