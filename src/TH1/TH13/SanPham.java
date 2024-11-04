package TH13;


/**
 * Create on 06/10/2024 15:29 by jayce
 */

public class SanPham {
    private String maSP, tenSP;
    private long giaSP, baoHanh;

    public SanPham(String maSP, String tenSP, long giaSP, long baoHanh) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.giaSP = giaSP;
        this.baoHanh = baoHanh;
    }

    public String getMaSP() {
        return maSP;
    }

    public long getGiaSP() {
        return giaSP;
    }

    public long getBaoHanh() {
        return baoHanh;
    }
}
