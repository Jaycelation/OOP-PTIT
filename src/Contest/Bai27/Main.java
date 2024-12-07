package Contest.Bai27;


import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, FileNotFoundException {
        Scanner sc = new Scanner(new File("MONHOC.in"));
        int n = Integer.parseInt(sc.nextLine());
        while (n-- > 0) {
            String s = sc.nextLine();
        }

        sc = new Scanner(new File("GIANGVIEN.in"));
        n = Integer.parseInt(sc.nextLine());
        ArrayList<GiangVien> listGV = new ArrayList<>();
        Map<String, GiangVien> map = new HashMap<>();
        while (n-- > 0) {
            String maGV = sc.next();
            String tenGV = sc.nextLine();
            listGV.add(new GiangVien(maGV, tenGV));
            map.put(maGV, new GiangVien(maGV, tenGV));
        }

        sc = new Scanner(new File("GIOCHUAN.in"));
        n = Integer.parseInt(sc.nextLine());
        while (n-- > 0) {
            String maGV = sc.next();
            String maMH = sc.next();
            double gioDay = Double.parseDouble(sc.nextLine());
            for (GiangVien gv : listGV) {
                if (gv.getMaGV().equals(maGV)) {
                    gv.setGioDay(gioDay + gv.getGioDay());
                }
            }
        }
        for (GiangVien gv : listGV) {
            System.out.println(gv);
        }

    }
}
