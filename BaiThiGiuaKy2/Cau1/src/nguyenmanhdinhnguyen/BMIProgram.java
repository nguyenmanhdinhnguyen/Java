package thigk2.nguyenmanhdinhnguyen;

import java.util.Scanner;

public class BMIProgram {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Nhập dữ liệu
		System.out.print("Nhập chiều cao ( m ): ");
		double height = sc.nextDouble();
		
		System.out.print("Nhập cân nặng ( kg ): ");
		double weight = sc.nextDouble();
		
		//Tính BMI
		double bmi = weight / ( height * height );
		
		//Xuât BMI
		System.out.println("Chỉ số BMI:" + bmi);
		
		//Phân loại sức khỏe
		if (bmi < 18.5) {
			System.out.println("Tình trạng: gầy");
		} else if (bmi < 25) {
			System.out.println("Tình trạng: bình thường");
		} else if (bmi < 30) {
			System.out.println("Tình trạng: thừa cân");
		} else {
			System.out.println("Tình trạng: béo phì");
		}
		
		sc.close();
	}
}
