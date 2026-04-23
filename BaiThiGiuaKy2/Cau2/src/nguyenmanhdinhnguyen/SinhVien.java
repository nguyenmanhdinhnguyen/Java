package thigk2.nguyenmanhdinhnguyen;

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
}
