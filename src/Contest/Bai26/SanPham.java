package Contest.Bai26;

public class SanPham {
    private String maSP, tenSP;
    private int giaBan;
    private int thangBH;

    public SanPham(String maSP, String tenSP, int giaBan, int thangBH) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.giaBan = giaBan;
        this.thangBH = thangBH;
    }

    public String getMaSP() {
        return maSP;
    }

    public int getGiaBan() {
        return giaBan;
    }

    public int getThangBH() {
        return thangBH;
    }

    @Override
    public String toString() {
        return maSP;
    }
}