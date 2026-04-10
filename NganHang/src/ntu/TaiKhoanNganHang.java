package ntu;

public class TaiKhoanNganHang {
	private String soTaiKhoan;
	private String tenChuTaiKhoan;
	private double soDu;
	
	public TaiKhoanNganHang(String soTaiKhoan) {
		this.soTaiKhoan = soTaiKhoan;
		this.tenChuTaiKhoan = "Chua xac dinh";
		this.soDu = 0.0;
	}
	
	public TaiKhoanNganHang(String soTaiKhoan, String tenChuTaiKhoan, double soDu) {
		this.soTaiKhoan = soTaiKhoan;
		this.tenChuTaiKhoan = tenChuTaiKhoan;
		this.soDu = 0.0;
	}
	
	public TaiKhoanNganHang(String soTaiKhoan, String tenChuTaikhoan, double soDu) {
		this.soTaiKhoan = soTaiKhoan;
		this.tenChuTaiKhoan = tenChuTaiKhoan;
		this.soDu = (soDu >= 0) ? soDu : 0.0;
	}
	
	
}
