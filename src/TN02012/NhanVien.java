package TN02012;


public class NhanVien {
    private String maNV, tenNV;
    private int luongCB, soNgayCong;
    private PhongBan phongBan;
    public NhanVien(String maNV, String tenNV, int luongCB, int soNgayCong, PhongBan phongBan) {
        this.maNV = maNV;
        this.tenNV = tenNV;
        this.luongCB = luongCB;
        this.soNgayCong = soNgayCong;
        this.phongBan = phongBan;
    }

    private int tinhLuong() {
        char phanLoai = maNV.charAt(0);
        int namKN = Integer.parseInt(maNV.substring(1, 3));
        int heSo = 0;
        if (phanLoai == 'A') {
            if (namKN >= 1 && namKN <= 3) {
                heSo = 10;
            } else if (namKN >= 4 && namKN <= 8) {
                heSo = 12;
            } else if (namKN >= 9 && namKN <= 15) {
                heSo = 14;
            } else {
                heSo = 20;
            }
        } else if (phanLoai == 'B') {
            if (namKN >= 1 && namKN <= 3) {
                heSo = 10;
            } else if (namKN >= 4 && namKN <= 8) {
                heSo = 11;
            } else if (namKN >= 9 && namKN <= 15) {
                heSo = 13;
            } else {
                heSo = 16;
            }
        } else if (phanLoai == 'C') {
            if (namKN >= 1 && namKN <= 3) {
                heSo = 9;
            } else if (namKN >= 4 && namKN <= 8) {
                heSo = 10;
            } else if (namKN >= 9 && namKN <= 15) {
                heSo = 12;
            } else {
                heSo = 14;
            }
        } else if (phanLoai == 'D') {
            if (namKN >= 1 && namKN <= 3) {
                heSo = 8;
            } else if (namKN >= 4 && namKN <= 8) {
                heSo = 9;
            } else if (namKN >= 9 && namKN <= 15) {
                heSo = 11;
            } else {
                heSo = 13;
            }
        }

        return heSo * luongCB * soNgayCong * 1000;

    }

    public String getMaNV() {
        return maNV;
    }

    @Override
    public String toString() {
        return maNV + " " + tenNV + " " + phongBan + " " + tinhLuong();
    }
}
