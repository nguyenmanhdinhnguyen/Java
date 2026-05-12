package thigk2.nguyenmanhdinhnguyen;

import java.util.Scanner;

public class SinhVien {
	private String maSV;
	private String hoTen;
	private int namSinh;
	private double diemTB;
	
	//Constructer
	public SinhVien(String maSV, string hoTen, int namSinh, double diemTB) {
		this.maSV = maSV;
		this.hoTen = hoTen;
		this.namSinh = namSinh;
		this.diemTB = diemTB;
	}
	
	//Getter Setter
	public String getMaSV() {
		return maSV;
	}
	
	public void setMaSV(String maSV) {
		this.maSV = maSV;
	}
	
	public String getHoTen() {
		return hoTen;
	}
	
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	
	public int getNamSinh() {
		return namSinh;
	}
	public void setNamSinh() {
		this.namSinh = namSinh;
	}
	
	public double getDiemTB() {
		return diemTB;
	}
	
	public void setDiemTB() {
		this.diemTB = diemTB:
	}
	
	//Hàm tính tuổi
	public int tinhTuoi() {
		int namHienTai = java.time.Year.now().getValue();
		return namHienTai - namSinh;
	}
	
	//Hiển thị thông tin
	public void hienThi() {
		System.out.println("Mã sv :" + maSV +
				"| Họ tên: " + hoTen +
				"| Năm sinh: " + namSinh +
				"| Điểm TB: " + diemTB +
				"| Tuổi: " + tinhTuoi());
	}
}

public class Main{
	public static void main(String[] args) {
		ArrayList<SinhVien> ds = new ArrayList<>();
		//Hard-code 3 sinh viên
		ds.add(new SinhVien("SV01", "Nguyen Van A", 2002, 7.5));
		ds.add(new SinhVien("SV02", "Nguyen Van B", 2003, 4.5));
		ds.add(new SinhVien("SV03", "Nguyen Van C", 2001, 5.5));
	}
	
	//In danh sách
	System.out.println("Danh sách ban đầu:");
	for (SinhVien sv : ds) {
		sv.hienThi();
	}
	
	//Nhập thêm
	
	Scanner sc = new Scanner(System.in);
	System.out.println("\nNhập sinh viên mới:");
	
	System.out.print("Mã SV: ");
	String ma = sc.nextLine();
	
	System.out.print("Họ tên: ");
	String ten = sc.nextLine();
	
	System.out.print("Năm sinh: ");
	int nam = sc.nextInt();
	
	System.out.print("Điểm TB: ");
	double diem = sc.nextDouble();
	
	ds.add(new SinhVien(ma,ten,nam,diem));
	
	//In lại
	System.out.println("\nDanh sách sinh viên sau khi thêm:");
	for (SinhVien sv : ds) {
		sv.hienThi();
	}
	
	//Lọc sinh viên > 20 tuổi
	System.out.println("\nSinh viên > 20 tuổi:");
	For (SinhVien sv : ds){
		if (sv.tinhTuoi() > 20) {
			sv.hienThi();
		}
	}
	
	sc.close();
}
