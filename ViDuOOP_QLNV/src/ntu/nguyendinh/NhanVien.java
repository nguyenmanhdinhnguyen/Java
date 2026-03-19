package ntu.nguyendinh;

public class NhanVien {
    private String maNv;
    private String hoTen;
    private double luongCoBan;

  
    public NhanVien() {
    }


    public NhanVien(String maNv, String hoTen, double luongCoBan) {
        this.maNv = maNv;
        this.hoTen = hoTen;
        this.luongCoBan = luongCoBan;
    }
    
    public double tinhLuong() { 
    	return luongCoBan;
    }

	@Override
	public String toString() {
		String chuoiXuat="";
		chuoiXuat = chuoiXuat + "Ma nv: " + this.maNv;
		chuoiXuat = chuoiXuat + " Ho Ten: " + this.hoTen;
		chuoiXuat = chuoiXuat + " Luong: " + this.luongCoBan;

		return chuoiXuat;
	}
    
    public void hienThiThongTin() {
    	System.out.println("ma nv = " + maNv);
    	System.out.println("Ho ten = " + hoTen);
    	System.out.println("Luong co ban = " + luongCoBan);
    }

	public String getMaNv() {
		return maNv;
	}

	public void setMaNv(String maNv) {
		this.maNv = maNv;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public double getLuongCoBan() {
		return luongCoBan;
	}

	public void setLuongCoBan(double luongCoBan) {
		this.luongCoBan = luongCoBan;
	}
}