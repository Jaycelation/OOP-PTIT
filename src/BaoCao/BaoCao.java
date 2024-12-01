package BaoCao;

public class BaoCao {
    private SinhVien sinhVien;
    private String thoiGian;
    private String trangThai;


    public BaoCao(SinhVien sinhVien, String thoiGian, String trangThai) {
        this.sinhVien = sinhVien;
        this.thoiGian = thoiGian;
        this.trangThai = trangThai;
    }

    public String getTrangThai() {
        return trangThai;
    }

    @Override
    public String toString() {
        return sinhVien + " " + thoiGian;
    }
}