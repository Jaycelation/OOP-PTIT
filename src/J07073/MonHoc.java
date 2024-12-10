package J07073;


public class MonHoc {
    private String maMH, tenMH;
    private int soTC;
    private String hinhThucLT, hinhThucTH;
    public MonHoc(String maMH, String tenMH, int soTC, String hinhThucLT, String hinhThucTH) {
        this.maMH = maMH;
        this.tenMH = tenMH;
        this.soTC = soTC;
        this.hinhThucLT = hinhThucLT;
        this.hinhThucTH = hinhThucTH;
    }

    public String getMaMH() {
        return maMH;
    }

    @Override
    public String toString() {
        return maMH + " " + tenMH + " " + soTC + " " + hinhThucLT + " " + hinhThucTH;
    }
}
