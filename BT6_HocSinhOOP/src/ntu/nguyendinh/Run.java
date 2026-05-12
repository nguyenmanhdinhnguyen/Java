package ntu.nguyendinh;

import java.util.Scanner;

public class Run {
	public static void main(String[] args) {
		HocSinh hs1 = new HocSinh();
		
		String tenHS1 = "Trần Văn A";
		hs1.setLopHS(tenHS1);
		
		short tuoiHS1 = 10;
		hs1.setTuoiHS(tuoiHS1);
		
		String lopHS1 = "8A";
		hs1.setLopHS(lopHS1);
		
		HocSinh hs2 = new HocSinh("Trần Văn B", (short)12,"9B");
		
		System.out.print(hs1.toString());
		System.out.print(hs2.toString());
		
		System.out.println("Tên của HS 2 là: " + hs2.getTenHS());
		System.out.println("Tuổi của HS 2 là: " + hs2.getTuoiHS());
		System.out.println("Lớp của HS 2 là: " + hs2.getLopHS());
		
		Scanner banPhim = new Scanner(System.in);
		
		HocSinh hs3 = new HocSinh();
		System.out.print("Mời nhập tên của hs 3: ");
		String tenHS3 = banPhim.nextLine();
		hs3.setTenHS(tenHS3);
		
		System.out.print("Mời nhập tuổi của hs 3: ");
		short tuoiHS3 = banPhim.nextShort();
		hs3.setTuoiHS(tuoiHS3);
		
		System.out.print("Mời nhập lớp của hs 3: ");
		String lopHS3 = banPhim.nextLine();
		hs3.setLopHS(lopHS3);
		
		System.out.print(hs3.toString());
		
		ArrayList<HocSinh> dsHS = new ArrayList<HocSinh>();
		
		int n = 3;
		
		for ( int i = 0; i < n; i++) {

			HocSinh hsi = new HocSinh();
			System.out.print("Mời nhập tên của hs: " + i);
			String tenHSi = banPhim.nextLine();
			hsi.setTenHS(tenHSi);
			
			System.out.print("Mời nhập tuổi của hs: " + i);
			short tuoiHSi = banPhim.nextShort();
			hsi.setTuoiHS(tuoiHSi);
			
			System.out.print("Mời nhập lớp của hs: " + i);
			String lopHSi = banPhim.nextLine();
			hsi.setLopHS(lopHSi);
			
			dsHS.add(hsi);
		}
		
		
		for ( int i = 0; i < n; i++) {
			System.out.println(dsHS.get(i).toString());
		}
		
		HocSinh hsThem = new HocSinh();
		
		dsHS.add(hsThem);
		
		for (int i = 0; i < n; i++) {
			System.out.println(dsHS.get(i).toString());
		}
		
		for ( int i = 0; i < n; i++) {
			HocSinh hsTim = new HocSinh();
			if (hsTim.getTenHS()=="Hoa") {
				dsHS.remove(hsTim);
				break;S
			}
		}
		
		
	}
}
