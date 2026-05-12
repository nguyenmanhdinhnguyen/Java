package Java.BT2_PhuongTrinh;

public class phuongtrinh {
    public static void main(String[] args) {
        double a = 2;
        double b = -4;

        if (a != 0) {
            double x = -b / a;
            System.out.println("x = " + x);
        } else {
            if (b == 0) {
                System.out.println("Phuong trinh vo so nghiem");
            } else {
                System.out.println("Phuong trinh vo nghiem");
            }
        }
    }
}