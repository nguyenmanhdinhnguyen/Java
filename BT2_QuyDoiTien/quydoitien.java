package Java.BT2_QuyDoiTien;

import java.util.Scanner;

public class quydoitien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final double USD_TO_VND = 23500;
        final double EUR_TO_VND = 27000;

        System.out.print("Nhap so tien USD: ");
        double usd = sc.nextDouble();

        System.out.print("Nhap so tien EUR: ");
        double eur = sc.nextDouble();

        double vndFromUSD = usd * USD_TO_VND;
        double vndFromEUR = eur * EUR_TO_VND;

        System.out.println("USD sang VND: " + vndFromUSD);
        System.out.println("EUR sang VND: " + vndFromEUR);

        sc.close();
    }
}