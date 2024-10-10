package J04007;

public class NhanVien {
    private String id = "00001", hoTen, gioiTinh, ngaySinh, diaChi, taxId, ngayKiHopDong;

    public NhanVien() {
    }

    public NhanVien(String hoTen, String gioiTinh, String ngaySinh, String diaChi, String taxId, String ngayKiHopDong) {
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
        this.taxId = taxId;
        this.ngayKiHopDong = ngayKiHopDong;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getTaxId() {
        return taxId;
    }

    public void setTaxId(String taxId) {
        this.taxId = taxId;
    }

    public String getNgayKiHopDong() {
        return ngayKiHopDong;
    }

    public void setNgayKiHopDong(String ngayKiHopDong) {
        this.ngayKiHopDong = ngayKiHopDong;
    }

    @Override
    public String toString() {
        return id + " " + hoTen + " " + gioiTinh + " " + ngaySinh + " " + diaChi + " " + taxId + " " + ngayKiHopDong + "\n";
    }
}
