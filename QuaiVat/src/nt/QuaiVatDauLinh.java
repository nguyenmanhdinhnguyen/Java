package nt;

public class QuaiVatDauLinh extends QuaiVat {
	public QuaiVatDauLinh() {
		super("Quai dau linh", 100);
	}
	
	@Override
	public double tanCong() {
		double damage = 10 + Math.random()* 10;
		System.out.println(ten + " tung skill manh gay " + damage);
		return damage;
	}
	
	@Override
	public void nhanSatThuong(double damage) {
		damage *= 0.8;
		super.nhanSatThuong(damage);
	}
}


