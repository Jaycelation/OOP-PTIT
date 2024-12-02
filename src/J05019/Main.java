package J05019;


import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        ArrayList<LuongMua> listLM = new ArrayList<>();
        HashMap<String, Integer> map = new HashMap<>();
        HashMap<String, Integer> mapCount = new HashMap<>();
        int cnt = 1;
        while (n -- > 0) {
            String maKV = "T" + String.format("%02d", cnt++);
            String tenKV = scanner.nextLine();
            String thoiGianBD = scanner.nextLine();
            String thoiGianKT = scanner.nextLine();
            int chiSo = Integer.parseInt(scanner.nextLine());
            map.put(tenKV, map.getOrDefault(tenKV, 0) + chiSo);
            mapCount.put(tenKV, mapCount.getOrDefault(tenKV, 0) + 1);
            listLM.add(new LuongMua(maKV, tenKV, thoiGianBD, thoiGianKT, chiSo));
        }

        HashMap<String, Double> total = new HashMap<>();
        for (String tenKV : map.keySet()) {
            double average = (double) map.get(tenKV) / mapCount.get(tenKV);
            total.put(tenKV, average);
        }
        listLM.sort(Comparator.comparing(LuongMua::getTenKV));
        for (LuongMua luongMua : listLM) {
            System.out.println(luongMua);
        }

    }
}
/*
10
Dong Anh
07:30
08:00
60
Cau Giay
07:45
08:12
50
Soc Son
08:00
09:15
78
Dong Anh
18:50
20:00
88
Cau Giay
19:01
20:00
77
Soc Son
19:06
20:21
66
Dong Anh
21:00
21:40
49
Cau Giay
21:50
22:20
68
Dong Anh
22:15
23:45
30
Cau Giay
22:50
23:45
35
 */