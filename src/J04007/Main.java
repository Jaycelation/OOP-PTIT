package J04007;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String hoTen, gioiTinh, ngaySinh, diaChi, taxId, ngayKiHopDong;

        hoTen = scanner.nextLine();
        gioiTinh = scanner.nextLine();
        ngaySinh = scanner.nextLine();
        diaChi = scanner.nextLine();
        taxId = scanner.nextLine();
        ngayKiHopDong = scanner.nextLine();

        NhanVien nhanVien = new NhanVien(hoTen, gioiTinh, ngaySinh, diaChi, taxId, ngayKiHopDong);
        System.out.println(nhanVien.toString());

    }
}