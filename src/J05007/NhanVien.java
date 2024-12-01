package J05007;

public class NhanVien {
    private String id, hoTen, gioiTinh, ngaySinh, diaChi, maSoThue, ngayKyHopDong;

    public NhanVien(String id, String hoTen, String gioiTinh, String ngaySinh, String diaChi, String maSoThue, String ngayKyHopDong) {
        this.id = id;
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
        this.maSoThue = maSoThue;
        this.ngayKyHopDong = ngayKyHopDong;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    @Override
    public String toString() {
        return id + " " + hoTen + " " + gioiTinh + " " + ngaySinh + " " + diaChi + " " + maSoThue + " " + ngayKyHopDong;
    }
}
