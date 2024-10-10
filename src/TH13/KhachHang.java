package TH13;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Create on 06/10/2024 15:32 by jayce
 */

public class KhachHang implements Comparable<KhachHang> {
    public static int cnt = 1;
    private SanPham sanPham;
    private String maKH;
    private String tenKH;
    private String diaChi;
    private String maSP;
    private String ngayHetHan;
    private String ngayMua;
    private long soLuong, tongTien;
    private Date thoiGian;

    public KhachHang(String hoTen, String diaChi, SanPham sanPham, int soLuong, String ngayMua) throws ParseException {
        this.sanPham = sanPham;
        this.maKH = "KH" + String.format("%02d", cnt++);
        this.tenKH = hoTen;
        this.diaChi = diaChi;
        this.soLuong = soLuong;
        this.ngayMua = ngayMua;
        this.tongTien = soLuong * sanPham.getGiaSP();
        String[] tmp = ngayMua.split("/");
        Long thang = Long.parseLong(tmp[1]);
        Long nam = Long.parseLong(tmp[2]);
        thang += sanPham.getBaoHanh();
        nam += thang / 12;
        thang %= 12;
        if (thang == 0) {
            thang = (long) 12;
            nam--;
        }
        this.ngayHetHan = String.format("%s/%02d/%04d", tmp[0], thang, nam);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        this.thoiGian = sdf.parse(this.ngayHetHan);

    }

    public String toString() {
        return maKH + " " + tenKH + " " + diaChi + " " + sanPham.getMaSP() + " " + tongTien + " " + ngayHetHan;
    }

    @Override
    public int compareTo(KhachHang o) {
        if (this.thoiGian == o.thoiGian) return this.maKH.compareTo(o.maKH);
        return this.thoiGian.compareTo(o.thoiGian);
    }
}
