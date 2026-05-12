package nt;

public class QuaiVatPhoiThai extends QuaiVat {
	public QuaiVatPhoiThat() {
		super("Quai vat phoi thai", 30);
	}
	
	@Override
	public double tanCong() {
		double damage = 3 + Math.random()* 3;
	}
	
}
