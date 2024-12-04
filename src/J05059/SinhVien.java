package J05059;

public class SinhVien {
    private String maSV, tenSV;
    private double diemUT;
    private double diemSV;
    public SinhVien(String maSV, String tenSV, double diemSV) {
        this.maSV = maSV;
        this.tenSV = tenSV;
        if (maSV.substring(0, 3).equals("KV1")) {
            this.diemUT = 0.5;
        } else if (maSV.substring(0, 3).equals("KV2")) {
            this.diemUT = (int)1.0;
        } else {
            this.diemUT = 2.5;
        }
        this.diemSV = diemSV + diemUT;
    }

    public String getMaSV() {
        return maSV;
    }

    public double getDiemSV() {
        return diemSV;
    }

    public String printUT() {
        int UT = 0;
        if ((diemUT - (int)diemUT) == 0) {
            UT = (int)diemUT;
            return String.valueOf(UT);
        } else {
            return String.format("%.1f", diemUT);
        }
    }

    public String printSV() {
        int SV = 0;
        if ((diemSV - (int)diemSV) == 0) {
            SV = (int)diemSV;
           return String.valueOf(SV);
        } else {
            return String.format("%.1f", diemSV);
        }
    }

    @Override
    public String toString() {
        return maSV + " " + tenSV + " " + printUT() + " " + printSV();
    }
}
