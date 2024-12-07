package Contest.Bai26;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, FileNotFoundException {
        Scanner scanner = new Scanner(new File("MUAHANG.in"));
        int n = Integer.parseInt(scanner.nextLine());
        ArrayList<SanPham> listSP = new ArrayList<>();
        while (n-- > 0) {
            listSP.add(new SanPham(scanner.nextLine(), scanner.nextLine(), Integer.parseInt(scanner.nextLine()), Integer.parseInt(scanner.nextLine())));
        }

        n = Integer.parseInt(scanner.nextLine());
        ArrayList<KhachHang> listKH = new ArrayList<>();
        int cnt = 1;
        while (n-- > 0) {
            String maKH = "KH" + String.format("%02d", cnt++);
            String tenKH = scanner.nextLine();
            String diaChi = scanner.nextLine();
            String maSP = scanner.nextLine();
            SanPham sanPham = null;
            for (SanPham sp : listSP) {
                if (sp.getMaSP().equals(maSP)) {
                    sanPham = sp;
                    break;
                }
            }
            int soLuong = Integer.parseInt(scanner.nextLine());
            String ngayMua = scanner.nextLine();
            listKH.add(new KhachHang(maKH, tenKH, diaChi, sanPham, soLuong, ngayMua));
        }

        for (int i = 0; i < listKH.size(); i++) {
            KhachHang kh = listKH.get(i);
            for (int j = 0; j < listSP.size(); j++) {
                SanPham sp = listSP.get(j);
                if (kh.getMaSP().equals(sp.getMaSP())) {
                    LocalDate date = LocalDate.parse(kh.getNgayMua(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                    LocalDate hanSD = date.plusMonths(sp.getThangBH());
                    String hanBH = hanSD.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                    kh.setHanBH(hanBH);
                }
            }
        }

        listKH.sort(Comparator.comparing(KhachHang::ngay).thenComparing(KhachHang::getMaKH));
        for (KhachHang kh : listKH) {
            System.out.println(kh);
        }
    }
}