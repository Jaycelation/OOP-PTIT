package J05007;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<NhanVien> listNV = new ArrayList<>();
        int count = 1;
        while (n-- > 0) {
            String id = "000" + String.format("%02d", count++);
            String hoTen = sc.nextLine();
            String gioiTinh = sc.nextLine();
            String ngaySinh = sc.nextLine();
            String diaChi = sc.nextLine();
            String maSoThue = sc.nextLine();
            String ngayKyHopDong = sc.nextLine();
            listNV.add(new NhanVien(id, hoTen, gioiTinh, ngaySinh, diaChi, maSoThue, ngayKyHopDong));
        }
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        listNV.sort(Comparator.comparing(nv -> {
            try {
                return sdf.parse(nv.getNgaySinh());
            } catch (ParseException e) {
                throw new RuntimeException(e);
            }
        }));
        for (NhanVien nv : listNV) {
            System.out.println(nv);
        }
    }
}
/*
3
Nguyen Van A
Nam
22/10/1982
Mo Lao-Ha Dong-Ha Noi
8333012345
31/12/2013
Ly Thi B
Nu
15/10/1988
Mo Lao-Ha Dong-Ha Noi
8333012346
22/08/201
Hoang Thi C
Nu
04/02/1981
Mo Lao-Ha Dong-Ha Noi
8333012347
22/08/2011
 */