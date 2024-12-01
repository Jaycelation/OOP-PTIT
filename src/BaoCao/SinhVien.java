package BaoCao;

public class SinhVien {
    private String maSV, tenSV, tenDeTai;

    public SinhVien(String maSV, String tenSV, String tenDeTai) {
        this.maSV = maSV;
        this.tenSV = tenSV;
        this.tenDeTai = tenDeTai;
    }

    public String getMaSV() {
        return maSV;
    }

    @Override
    public String toString() {
        return maSV + " " + tenSV + " " + tenDeTai;
    }
}