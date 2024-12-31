package J05031;

public class SinhVien {
    private String maSV, tenSV, lop;
    private double d1, d2, d3;

    public SinhVien(String maSV, String tenSV, String lop, double d1, double d2, double d3) {
        this.maSV = maSV;
        this.tenSV = tenSV;
        this.lop = lop;
        this.d1 = d1;
        this.d2 = d2;
        this.d3 = d3;
    }

    public String getTenSV() {
        return tenSV;
    }

    @Override
    public String toString() {
        return maSV + " " + tenSV + " " + lop + " " + String.format("%.1f %.1f %.1f", d1, d2, d3);
    }
}