package ntu.nguyendinh;

import java.util.ArrayList;
import java.util.List;

public class ArrayListCoBan {

    public static void main(String[] args) {

        List<String> danhSachTen = new ArrayList<>();

        danhSachTen.add("Nguyen Van An");
        danhSachTen.add("Tran Thi Lan");

        danhSachTen.add(1, "Le Quang Huy");

        System.out.println("danh sach sau khi them: " + danhSachTen);

        System.out.println("so phan tu: " + danhSachTen.size());

        System.out.println("Phan tu thu 0: " + danhSachTen.get(0));
        System.out.println("Phan tu thu 1: " + danhSachTen.get(1));

        System.out.println("Truoc khi cap nhat: " + danhSachTen.get(1));
        danhSachTen.set(1, "Pham Thi Mai");
        System.out.println("Sau khi cap nhat: " + danhSachTen.get(1));

        System.out.println("Co 'Le Van C' khong? " + danhSachTen.contains("Le Van C"));
        System.out.println("Vi tri cua 'Le Van C': " + danhSachTen.indexOf("Le Van C"));
        System.out.println("Vi tri cua 'Khong ton tai': " + danhSachTen.indexOf("Khong ton tai"));

        System.out.println("Truoc khi xoa: " + danhSachTen);

        String removedByIndex = danhSachTen.remove(0);
        System.out.println("Da xoa (index 0): " + removedByIndex);

        boolean removedByObject = danhSachTen.remove("Le Van C");
        System.out.println("Xoa 'Le Van C' thanh cong? " + removedByObject);

        System.out.println("Sau khi xoa: " + danhSachTen);

        System.out.println("danh sach co trong khong " + danhSachTen.isEmpty());

        System.out.println("Cach 1:");
        for (int i = 0; i < danhSachTen.size(); i++) {
            System.out.println("Vi tri " + i + ": " + danhSachTen.get(i));
        }

        System.out.println("Cach 2:");
        for (String ten : danhSachTen) {
            System.out.println("Ten: " + ten);
        }

        System.out.println("Cach 3:");
        danhSachTen.forEach(ten -> System.out.println("Ten: " + ten));

        System.out.println("Mang chuyen doi:");
        String[] mangTen = danhSachTen.toArray(new String[0]);
        for (String ten : mangTen) {
            System.out.println(ten);
        }

        danhSachTen.clear();
        System.out.println("Sau khi clear, kich thuoc: " + danhSachTen.size());
        System.out.println("Danh sach co rong khong? " + danhSachTen.isEmpty());
    }
}