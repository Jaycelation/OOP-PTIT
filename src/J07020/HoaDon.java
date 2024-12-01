package J07020;


public class HoaDon {
    private KhachHang khachHang;
    private MatHang matHang;
    private int count;

    public HoaDon(KhachHang khachHang, MatHang matHang, int count) {
        this.khachHang = khachHang;
        this.matHang = matHang;
        this.count = count;
    }

    @Override
    public String toString() {
        return khachHang + " " + matHang + " " + count;
    }
}
