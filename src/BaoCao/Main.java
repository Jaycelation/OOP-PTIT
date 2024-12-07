package BaoCao;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, FileNotFoundException {
        Scanner scanner = new Scanner(new File("BAITAP.in"));
        ArrayList<SinhVien> listSv = new ArrayList<>();
        while (scanner.hasNextLine()) {
            String maSV = scanner.nextLine();
            String tenSV = scanner.nextLine();
            String tenDeTai = scanner.nextLine();
            listSv.add(new SinhVien(maSV, tenSV, tenDeTai));
        }
        scanner = new Scanner(new File("BAOCAO.in"));
        ArrayList<BaoCao> listBC = new ArrayList<>();
        while (scanner.hasNextLine()) {
            String maSV = scanner.nextLine();
            String thoiGian = scanner.nextLine();
            String trangThai = "";
            SinhVien sinhVien = null;
            for (SinhVien s : listSv) {
                if (s.getMaSV().equals(maSV)) {
                    sinhVien = s;
                    break;
                }
            }
            Integer gio = Integer.parseInt(thoiGian.substring(0, 2));
            Integer phut = Integer.parseInt(thoiGian.substring(3, 5));
            if (gio >= 12) {
                trangThai = "chieu";
                gio -= 12;
                String gioFomartted = String.format("%02d", gio);
                String phutFomartted = String.format("%02d", phut);
                thoiGian = gioFomartted + ":" + phutFomartted;
            } else {
                trangThai = "sang";
            }
            listBC.add(new BaoCao(sinhVien, thoiGian, trangThai));
        }
        int demSang = 0, demChieu = 0;
        for (BaoCao baoCao : listBC) {
            if (baoCao.getTrangThai().equals("sang")) {
                demSang++;
            } else {
                demChieu++;
            }
        }
        System.out.println("DANH SACH SINH VIEN BAO CAO CA SANG: " + demSang);
        for (BaoCao baoCao : listBC) {
            if (baoCao.getTrangThai().equals("sang")) {
                System.out.println(baoCao);
            }
        }
        System.out.println("DANH SACH SINH VIEN BAO CAO CA CHIEU: " + demChieu);
        for (BaoCao baoCao : listBC) {
            if (baoCao.getTrangThai().equals("chieu")) {
                System.out.println(baoCao);
            }
        }
    }
}