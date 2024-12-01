package J07049;


public class KhachHang {
    private String maKH, tenKH, diaChi;
    private SanPham sanPham;
    private int soLuongMua;
    private String ngayMua;
    private String hanBH;
    public KhachHang(String maKH, String tenKH, String diaChi, SanPham sanPham, int soLuongMua, String ngayMua) {
        this.maKH = maKH;
        this.tenKH = tenKH;
        this.diaChi = diaChi;
        this.sanPham = sanPham;
        this.soLuongMua = soLuongMua;
        this.ngayMua = ngayMua;
    }

    private int thanhTien() {
        return soLuongMua * sanPham.getGiaBan();
    }

    public void setHanBH(String hanBH) {
        this.hanBH = hanBH;
    }

    public String getNgayMua() {
        return ngayMua;
    }

    public String getMaSP() {
        return sanPham.getMaSP();
    }

    public String getMaKH() {
        return maKH;
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