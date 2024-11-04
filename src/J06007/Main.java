package J06007;


import java.util.*;
import java.io.*;

/**
 * Create on 27/10/2024 13:25 by jayce
 */

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.nextLine());
        ArrayList<MonHoc> listMH = new ArrayList<>();
        for (int i = 1; i <= a; ++i) {
            String[] line = sc.nextLine().split("\\s+");
            String id = line[0];
            String name = "";
            for (int j = 1; j < line.length; ++j) {
                name += line[j] + " ";
            }
            name = name.substring(0, name.length() - 1);
            MonHoc mh = new MonHoc(id, name);
            listMH.add(mh);
        }

        int b = Integer.parseInt(sc.nextLine());
        ArrayList<GiangVien> listGV = new ArrayList<>();
        for (int i = 1; i <= b; ++i) {
            String[] line = sc.nextLine().split("\\s+");
            String id = line[0];
            String name = "";
            for (int j = 1; j < line.length; ++j) {
                name += line[j] + " ";
            }
            name = name.substring(0, name.length() - 1);
            GiangVien gv = new GiangVien(id, name);
            listGV.add(gv);
        }

        int c = Integer.parseInt(sc.nextLine());
        ArrayList<HocPhan> listHP = new ArrayList<>();
        for (int i = 1; i <= c; ++i) {
            String[] line = sc.nextLine().split("\\s+");
            String idGV = line[0];
            String idHP = line[1];
            double time = Double.parseDouble(line[2]);
            GiangVien gv = null;
            for (GiangVien g : listGV) {
                if (idGV.equals(g.getId())) {
                    gv = g;
                    break;
                }
            }
            MonHoc mh = null;
            for (MonHoc m : listMH) {
                if (idHP.equals(m.getId())) {
                    mh = m;
                    break;
                }
            }
            HocPhan hp = new HocPhan(gv, mh, time);
            listHP.add(hp);
        }
        for (HocPhan hp : listHP) {
            System.out.println(hp);
        }
    }
}
/*
2
INT1155 Tin hoc co so 2
INT1306 Cau truc du lieu va giai thuat
2
GV01 Nguyen Van An
GV02 Hoang Binh Minh
2
GV01 INT1155 113.2
GV02 INT1306 126.72
 */