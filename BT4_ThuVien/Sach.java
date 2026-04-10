package Java.BT4_ThuVien;

import java.time.Year;

public class Sach {
    private String maSach;
    private String tenSach;
    private String tacGia;
    private int namXuatBan;
    private String trangThai;

   
    public Sach(String maSach, String tenSach, String tacGia, int namXuatBan) {
        int namHienTai = Year.now().getValue();

        this.maSach = maSach;
        this.tenSach = tenSach;
        this.tacGia = tacGia;

        if (namXuatBan > 1900 && namXuatBan <= namHienTai) {
            this.namXuatBan = namXuatBan;
        } else {
            System.out.println("Năm xuất bản không hợp lệ!");
            this.namXuatBan = namHienTai;
        }

        
        this.trangThai = "co san";
    }

   
    public void muonSach() {
        if (trangThai.equals("co san")) {
            trangThai = "dang muon";
            System.out.println("Muon sach thanh cong.");
        } else {
            System.out.println("Sach dang duoc muon.");
        }
    }

    
    public void traSach() {
        trangThai = "co san";
        System.out.println("Sach da duoc tra.");
    }

    
    public boolean kiemTraSachCu() {
        return namXuatBan < 2000;
    }

    
    public void hienThiThongTin() {
        System.out.println("Ma sach: " + maSach);
        System.out.println("Ten sach: " + tenSach);
        System.out.println("Tac gia: " + tacGia);
        System.out.println("Nam xuat ban: " + namXuatBan);
        System.out.println("Trang thai: " + trangThai);
    }
}