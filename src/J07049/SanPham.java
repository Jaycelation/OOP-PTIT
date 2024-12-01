package J07049;


public class SanPham {
    private String maSP, tenSP;
    private int giaBan, baoHanh;

    public SanPham(String maSP, String tenSP, int giaBan, int baoHanh) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.giaBan = giaBan;
        this.baoHanh = baoHanh;
    }

    public String getMaSP() {
        return maSP;
    }

    public int getBaoHanh() {
        return baoHanh;
    }

    public int getGiaBan() {
        return giaBan;
    }

    @Override
    public String toString() {
        return maSP;
    }
}
