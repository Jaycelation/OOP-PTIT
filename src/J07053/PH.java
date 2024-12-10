package J07053;

public class PH {
    private String maNV, tenNV, ngaySinh;
    private double diemLT, diemTH;
    private int diem;
    private String xepLoai;
    private int tuoi;

    public PH(String maNV, String tenNV, String ngaySinh, double diemLT, double diemTH) {
        this.maNV = maNV;
        String[] line = tenNV.trim().toLowerCase().split("\\s+");
        String temp = "";
        for (int i = 0; i < line.length; i++) {
            temp += line[i].substring(0, 1).toUpperCase() + line[i].substring(1) + " ";
        }
        this.tenNV = temp.trim();
        if (ngaySinh.charAt(1) == '/') {
            ngaySinh = "0" + ngaySinh;
        }
        if (ngaySinh.charAt(4) == '/') {
            ngaySinh = ngaySinh.substring(0, 3) + "0" + ngaySinh.substring(3);
        }
        this.ngaySinh = ngaySinh;
        this.diemLT = diemLT;
        this.diemTH = diemTH;

        double diemThuong = 0;
        if (diemLT >= 8 && diemTH >= 8) {
            diemThuong = 1;
        } else if (diemLT >= 7.5 && diemTH >= 7.5) {
            diemThuong = 0.5;
        } else {
            diemThuong = 0;
        }
        double val = (diemLT + diemTH) / 2 + diemThuong;
        diem = (int) Math.round(val);
        if (diem > 10) {
            diem = 10;
        }

        if (diem < 5) {
            xepLoai = "Truot";
        } else if (diem >= 5 && diem <= 6) {
            xepLoai = "Trung binh";
        } else if (diem == 7) {
            xepLoai = "Kha";
        } else if (diem == 8) {
            xepLoai = "Gioi";
        } else {
            xepLoai = "Xuat sac";
        }

        tuoi = 2021 - Integer.parseInt(ngaySinh.substring(6));

    }

    @Override
    public String toString() {
        return maNV + " " + tenNV + " " + tuoi + " " + diem + " " + xepLoai;
    }
}
