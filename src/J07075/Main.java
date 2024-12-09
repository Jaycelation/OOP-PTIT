package J07075;


import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("MONHOC.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<MonHoc> listMH = new ArrayList<>();
        while (n-- > 0) {
            listMH.add(new MonHoc(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine())));
        }
        sc = new Scanner(new File("LICHGD.in"));
        n = Integer.parseInt(sc.nextLine());
        ArrayList<Lich> listL = new ArrayList<>();
        Map<String, Lich> mapL = new HashMap<>();
        int cnt = 1;
        while (n-- > 0) {
            String maNhom = "HP" + String.format("%03d", cnt++);
            String maMH = sc.nextLine();
            MonHoc monHoc = null;
            for (MonHoc mh : listMH) {
                if (mh.getMaMH().equals(maMH)) {
                    monHoc = mh;
                    break;
                }
            }
            String thu = sc.nextLine();
            int kip = Integer.parseInt(sc.nextLine());
            String tenGV = sc.nextLine();
            String phong = sc.nextLine();
            listL.add(new Lich(maNhom, monHoc, thu, kip, tenGV, phong));
            mapL.put(tenGV, new Lich(maNhom, monHoc, thu, kip, tenGV, phong));
        }
        String tenGV = sc.nextLine();
        System.out.println("LICH GIANG DAY GIANG VIEN " + tenGV + ":");
        listL.sort(Comparator.comparing(Lich::getThu).thenComparing(Lich::getKip));
        for (Lich lich : listL) {
            if (lich.getTenGV().equals(tenGV)) {
                System.out.println(lich);
            }
        }
    }
}
