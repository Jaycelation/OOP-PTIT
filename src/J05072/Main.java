package J05072;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        ArrayList<ThanhPho> listTP = new ArrayList<>();
        while (n-- > 0) {
            listTP.add(new ThanhPho(scanner.nextLine(), scanner.nextLine(), Integer.parseInt(scanner.nextLine())));
        }

        n = Integer.parseInt(scanner.nextLine());
        ArrayList<CuocGoi> listC = new ArrayList<>();
        while (n-- > 0) {
            String[] line = scanner.nextLine().split("\\s+");
            String sdt = line[0];
            String thoiGianGoi = line[1];
            String thoiGianKT = line[2];
            ThanhPho thanhPho = null;
            if (sdt.charAt(0) == '0') {
                for (ThanhPho tp : listTP) {
                    if (tp.getMaVung().equals(sdt.substring(1, 3))) {
                        thanhPho = tp;
                        break;
                    }
                }
            }
            listC.add(new CuocGoi(sdt, thoiGianGoi, thoiGianKT, thanhPho));
        }
        listC.sort(Comparator.comparing(CuocGoi::getGiaCuoc).reversed());
        for (CuocGoi c : listC) {
            System.out.println(c);
        }
    }
}
/*
2
53
Da Nang
3000
64
Vung Tau
1000
3
064-824531 11:20 11:22
8293567 09:07 09:15
053-823532 12:00 12:05
 */