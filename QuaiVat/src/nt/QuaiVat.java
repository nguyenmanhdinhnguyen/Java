package nt;

abstract class QuaiVat {
	protected String ten;
	protected double mau;
	
	public QuaiVat(String ten, double mau) {
		this.ten = ten;
		this.mau = mau;
	}
	
	public abstract double tanCong();
	
	public void nhanSatThuong(double damage) {
		mau -= damage;
		if (mau < 0) mau = 0;
		System.out.println(ten + " nhan " + damage + "sat thuong!");
		
	}
	
	public boolean conSong() {
		return mau > 0;
	}
	
	public String getTen() {
		return ten;
	}
}
