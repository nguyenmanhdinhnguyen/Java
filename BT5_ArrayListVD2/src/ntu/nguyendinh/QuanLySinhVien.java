package ntu.nguyendinh;

import java.util.ArrayList;
import java.util.List;

public class QuanLySinhVien {

    private List<SinhVien> danhSachSV = new ArrayList<>();

    
    public void themSinhVien(SinhVien sv) {
        danhSachSV.add(sv);
    }

  
    public SinhVien timTheoMa(String maSV) {
        for (SinhVien sv : danhSachSV) {
            if (sv.getMaSV().equals(maSV)) {
                return sv;
            }
        }
        return null;
    }


    public SinhVien timDiemCaoNhat() {
        if (danhSachSV.size() == 0) return null;

        SinhVien max = danhSachSV.get(0);

        for (SinhVien sv : danhSachSV) {
            if (sv.getDiemTB() > max.getDiemTB()) {
                max = sv;
            }
        }
        return max;
    }

  
    public double tinhDiemTB() {
        if (danhSachSV.size() == 0) return 0;

        double tong = 0;
        for (SinhVien sv : danhSachSV) {
            tong += sv.getDiemTB();
        }

        return tong / danhSachSV.size();
    }

   
    public List<SinhVien> locTheoDiem(double diem) {
        List<SinhVien> ds = new ArrayList<>();

        for (SinhVien sv : danhSachSV) {
            if (sv.getDiemTB() >= diem) {
                ds.add(sv);
            }
        }

        return ds;
    }

 
    public void sapXep() {
        for (int i = 0; i < danhSachSV.size(); i++) {
            for (int j = i + 1; j < danhSachSV.size(); j++) {
                if (danhSachSV.get(i).getDiemTB() < danhSachSV.get(j).getDiemTB()) {
                    SinhVien temp = danhSachSV.get(i);
                    danhSachSV.set(i, danhSachSV.get(j));
                    danhSachSV.set(j, temp);
                }
            }
        }
    }


    public void hienThi() {
        for (SinhVien sv : danhSachSV) {
            System.out.println(sv);
        }
    }

    
    public void xoa(String maSV) {
        for (int i = 0; i < danhSachSV.size(); i++) {
            if (danhSachSV.get(i).getMaSV().equals(maSV)) {
                danhSachSV.remove(i);
                break;
            }
        }
    }
}