package ntu.nguyendinh;

public class NhanVienVanPhong  extends NhanVien {
	private double soGioLamThem;
	private double luongThemTheoMoiGio;

	public NhanVienVanPhong(String maNv, String hoTen, double luongCoBan, double soGioLamThem, double luongThemTheoMoiGio) {
		super(maNv, hoTen, luongCoBan); 
		this.soGioLamThem = soGioLamThem;
		this.luongThemTheoMoiGio = luongThemTheoMoiGio;
	}

	@Override
	public double tinhLuong() {
		return getLuongCoBan() + soGioLamThem * luongThemTheoMoiGio; 
	}

	@Override
	public void hienThiThongTin() {
		System.out.println("so gio lam them: " + soGioLamThem); 
		System.out.println("luong moi gio: " + luongThemTheoMoiGio); 
		System.out.println("Luong tong: " + tinhLuong());
	}

	public String toString() {
		String chuoiXuat = super.toString(); 
		chuoiXuat = chuoiXuat + " so gio lam them: " + this.soGioLamThem;
		chuoiXuat = chuoiXuat + " luong them moi gio: " + this.luongThemTheoMoiGio;
		chuoiXuat = chuoiXuat + " luong tong: " + this.tinhLuong();
		return chuoiXuat;
	}
}