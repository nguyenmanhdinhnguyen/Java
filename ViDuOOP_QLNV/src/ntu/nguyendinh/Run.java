package ntu.nguyendinh;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NhanVien nv1 = new NhanVien("001", "Dinh Nguyen", 340000);
		nv1.hienThiThongTin();
		System.out.print(nv1.toString());
		
		NhanVienVanPhong nvVanPhong1 = new NhanVienVanPhong("002", "Van Hau", 93492423, 3, 2000);
		System.out.print(nvVanPhong1.toString());
	}

}