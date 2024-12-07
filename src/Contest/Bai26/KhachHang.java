package Contest.Bai26;

public class KhachHang {
    private String maKH, tenKH, diaChi;
    private SanPham sanPham;
    private int soLuong;
    private String ngayMua;
    private String hanBH;

    public KhachHang(String maKH, String tenKH, String diaChi, SanPham sanPham, int soLuong, String ngayMua) {
        this.maKH = maKH;
        this.tenKH = tenKH;
        this.diaChi = diaChi;
        this.sanPham = sanPham;
        this.soLuong = soLuong;
        this.ngayMua = ngayMua;
    }

    public int thanhTien() {
        return soLuong * sanPham.getGiaBan();
    }

    public String getMaKH() {
        return maKH;
    }

    public String getNgayMua() {
        return ngayMua;
    }

    public String getMaSP() {
        return sanPham.getMaSP();
    }

    public void setHanBH(String hanBH) {
        this.hanBH = hanBH;
    }

    public String ngay() {
        String day = "" + this.hanBH.charAt(0) + this.hanBH.charAt(1);
        String month = "" + this.hanBH.charAt(3) + this.hanBH.charAt(4);
        String year = "" + this.hanBH.charAt(6) + this.hanBH.charAt(7) + this.hanBH.charAt(8) + this.hanBH.charAt(9);
        return year + month + day;
    }

    @Override
    public String toString() {
        return maKH + " " + tenKH + " " + diaChi + " " + sanPham + " " + thanhTien() + " " + hanBH;
    }
}