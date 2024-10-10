package TH8;


/**
 * Create on 06/10/2024 13:23 by jayce
 */

public class sinhVien {
    private String maSinhVien, hoTen, lop, email, soDienThoai;

    public sinhVien(String maSinhVien, String hoTen, String lop, String email, String soDienThoai) {
        this.maSinhVien = maSinhVien;
        this.hoTen = hoTen;
        this.lop = lop;
        this.email = email;
        this.soDienThoai = soDienThoai;
    }

    public sinhVien() {
    }

    public String getMaSinhVien() {
        return maSinhVien;
    }

    public String getLop() {
        return lop;
    }

    @Override
    public String toString() {
        return this.maSinhVien + " " + this.hoTen + " " + this.lop + " " + this.email + " 0" + this.soDienThoai;
    }
}
