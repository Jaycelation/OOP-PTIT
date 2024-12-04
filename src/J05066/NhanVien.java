package J05066;


import java.util.*;
import java.io.*;

public class NhanVien {
    private String maNV, tenNV;
    private String chucVu;
    private String hsLuong;
    private String shNV;
    public NhanVien(String maNV, String tenNV) {
        this.maNV = maNV;
        this.tenNV = tenNV;

        this.chucVu = maNV.substring(0, 2);
        this.hsLuong = maNV.substring(2, 4);
        this.shNV = maNV.substring(4);
    }

    public String getTenNV() {
        return tenNV;
    }

    public String getHsLuong() {
        return hsLuong;
    }

    public String getShNV() {
        return shNV;
    }

    @Override
    public String toString() {
        return tenNV + " " + chucVu + " " + shNV + " " + hsLuong;
    }
}
