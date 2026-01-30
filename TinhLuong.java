import java.util.Scanner;

public class TinhLuong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap so gio lam: ");
        double hours = sc.nextDouble();

        System.out.print("Nhap luong theo gio: ");
        double rate = sc.nextDouble();

        double salary;

        if (hours <= 40) {
            salary = hours * rate;
        } else {
            salary = 40 * rate + (hours - 40) * rate * 1.5;
        }

        System.out.println("Tong luong: " + salary);
    }
}
