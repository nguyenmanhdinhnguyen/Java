package Java.BT2_BMI;

public class bmi {
    public static void main(String[] args) {
    
        
        double weight = 67;    
        double height = 1.72;   
        
        double bmi = weight / (height * height);
        
        System.out.println("can nang: " + weight + " kg");
        System.out.println("chieu cao: " + height + " m");
        System.out.println("bmi: " + bmi);
        

        if (bmi < 18.5) {
            System.out.println("thieu can");
        } else if (bmi < 25) {
            System.out.println("binh thuong");
        } else if (bmi < 30) {
            System.out.println("thua can");
        } else {
            System.out.println("beo phi");
        }
    }
}