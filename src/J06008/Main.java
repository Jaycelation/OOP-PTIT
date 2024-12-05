package J06008;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Map<String, String> mapMH = new HashMap<>();
        while (n-- > 0) {
            String maMH = scanner.next();
            String tenMH = scanner.nextLine().trim();
            mapMH.put(maMH, tenMH);
        }

        n = Integer.parseInt(scanner.nextLine());
        Map<String, GiangVien> mapGV = new HashMap<>();

        while (n-- > 0) {
            String maGV = scanner.next();
            String tenGV = scanner.nextLine().trim();
            mapGV.put(maGV, new GiangVien(maGV, tenGV));
        }

        n = Integer.parseInt(scanner.nextLine());
        ArrayList<Lop> listL = new ArrayList<>();
        while (n-- > 0) {
            String[] line = scanner.nextLine().split("\\s+");
            String maGV = line[0];
            String maMH = line[1];
            double gio = Double.parseDouble(line[2]);
            listL.add(new Lop(maGV, maMH, gio));
        }

        String maGV = scanner.nextLine();
        GiangVien giangVien = mapGV.get(maGV);
        System.out.println("Giang vien: " + giangVien);
        for (Lop lop : listL) {
            if (lop.getMaGV().equals(maGV)) {
                System.out.println(mapMH.get(lop.getMaMH()) + " " + lop.getGio());
                giangVien.setTongGio(giangVien.getTongGio() + lop.getGio());
            }
        }
        System.out.println("Tong: " + String.format("%.2f", giangVien.getTongGio()));
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
GV01
 */