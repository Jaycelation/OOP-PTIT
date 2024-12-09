package J07047;


import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("DATA.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<LoaiPhong> listP = new ArrayList<>();
        while (n-- > 0) {
            listP.add(new LoaiPhong(sc.nextLine()));
        }

        n = Integer.parseInt(sc.nextLine());
        ArrayList<KhachHang> listKH = new ArrayList<>();
        int cnt = 1;
        while (n-- > 0) {
            String maKH = "KH" + String.format("%02d", cnt++);
            String tenKH = sc.nextLine();
            String maP = sc.nextLine();
            String ngayDen = sc.nextLine();
            String ngayDi = sc.nextLine();
            LoaiPhong loaiPhong = null;
            String kyHieu = maP.substring(2, 3);
            for (LoaiPhong lp : listP) {
                if (lp.getKyHieu().equals(kyHieu)) {
                    loaiPhong = lp;
                    break;
                }
            }
            listKH.add(new KhachHang(maKH, tenKH, maP, ngayDen, ngayDi, loaiPhong));
        }
        listKH.sort(Comparator.comparing(KhachHang::getDays).reversed());
        for (KhachHang kh : listKH) {
            System.out.println(kh);
        }
    }
}