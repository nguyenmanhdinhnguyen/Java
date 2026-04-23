package thigk2.nguyenmanhdinhnguyen;
import java.io.*;
import java.util.*;
public class DocVanBan {
	public static void main(String[] args) {
		String fileName = "numbers.txt";
		List<Integer> list = new ArrayList<>();
		
		//Nhập ký tự X
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập X: ");
		int x = sc.nextInt();
		//Đọc file
		try (BufferedReader br = new BufferedReader(new FileRead(fileName))){
			String line;
			
			while ((line = br.readLine()!= null)) {
				int num = Integer.parseInt(line.trim());
			}
		} catch (IOException e) {
			System.out("Lỗi đọc file: " +e.getMessage());
			return;
		}
		
		//In danh sách
		System.out.print("\nDanh sách số nguyên: ");
		for ( int num : list) {
			System.out.print(num + " ");
		}
		
		//In danh sách
		boolean found = false;
		for (int num : list) {
			if (num == x) {
				found = true;
				break;
			}
		}
		
		//Kết quả
		System.out.println("\nKết quả:");
		if (found) {
			System.out.println("Giá trị X = " + x +"Có trong danh sách.");
		} else {
			System.out.println("Giá trị x = " + x + " Không có trong danh sách");
		}
	}
}
