package J06007;

import java.util.*;
import java.io.*;


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
        HashMap<String, Double> map = new HashMap<>();
        while (c-- > 0) {
            String[] line = sc.nextLine().split("\\s+");
            String idGV = line[0];
            String idMH = line[1];
            double time = Double.parseDouble(line[2]);
            if (map.containsKey(idGV)) {
                map.put(idGV, map.get(idGV) + time);
            } else {
                map.put(idGV, time);
            }
        }

        for (GiangVien gv : listGV) {
            System.out.println(gv + " " + String.format("%.2f", map.get(gv.getId())));
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
3
GV01 INT1155 113.2
GV02 INT1306 126.72
GV01 INT1306 126.72
 */