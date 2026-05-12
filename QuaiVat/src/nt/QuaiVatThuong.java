package nt;

public class QuaiVatThuong extends QuaiVat {
	public QuaiVatThuong() {
		super("Quai thuong", 50);
	}
	
	@Override
	public double tanCong() {
		double damage = 5 + Math.random() * 5;
		System.out.println(ten + "tan cong gay" + damage);
		return damage;
	}
}
