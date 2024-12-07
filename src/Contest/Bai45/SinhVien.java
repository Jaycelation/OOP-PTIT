package Contest.Bai45;

public class SinhVien {
    private String maSV, tenSV, ngaySinh, xepLoai;
    private double diemTh, diem1, diem2;
    private int diemTK;
    private int tuoi;

    public SinhVien(String maSV, String tenSV, String ngaySinh, double diem1, double diem2) {
        this.maSV = maSV;
        this.tenSV = tenSV;
        this.ngaySinh = ngaySinh;
        this.diem1 = diem1;
        this.diem2 = diem2;
    }

    public void xepLoai() {
        if (diem1 >= 8 && diem2 >= 8) {
            diemTh = 1;
        }
        else if (diem1 >= 7.5 && diem2 >= 7.5) {
            diemTh = 0.5;
        }
        else {
            diemTh = 0;
        }

        double val = (diem1 + diem2) / 2 + diemTh;
        diemTK = (int) Math.round(val);

        if (diemTK > 10) {
            diemTK = 10;
        }

        if (diemTK < 5) {
            xepLoai = "Truot";
        } else if (diemTK >= 5 && diemTK <= 6) {
            xepLoai = "Trung binh";
        } else if (diemTK == 7) {
            xepLoai = "Kha";
        } else if (diemTK == 8) {
            xepLoai = "Gioi";
        } else {
            xepLoai = "Xuat sac";
        }

        tuoi = 2021 - Integer.parseInt(ngaySinh.substring(6));
    }

    @Override
    public String toString() {
        xepLoai();
        return maSV + " " + tenSV + " " + tuoi + " " + diemTK + " " + xepLoai;
    }
}