import java.util.Scanner;

public class QuyDoiTienTe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap so tien: ");
        double amount = sc.nextDouble();

        System.out.print("Nhap loai tien (USD hoac EUR): ");
        String type = sc.next();

        double vnd = 0;

        if (type.equalsIgnoreCase("USD")) {
            vnd = amount * 23500;
        } else if (type.equalsIgnoreCase("EUR")) {
            vnd = amount * 27000;
        } else {
            System.out.println("Loai tien khong hop le!");
            return;
        }

        System.out.println("So tien sau quy doi: " + vnd + " VND");
    }
}
