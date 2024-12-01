package TH2_2.Bai2;


import java.util.*;
import java.io.*;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = Integer.parseInt(sc.nextLine());
        ArrayList<CongNhan> listCN = new ArrayList<>();
        while (T-- > 0) {
            String id = sc.nextLine();
            String temp = sc.nextLine().toLowerCase();
            String[] val = temp.split("\\s+");
            String name = "";
            for (int i = 0; i < val.length; i++) {
                name += val[i].substring(0, 1).toUpperCase() + val[i].substring(1);
                if (i < val.length - 1) {
                    name += " ";
                }
            }
            String gioVao = sc.nextLine();
            String gioRa = sc.nextLine();
            listCN.add(new CongNhan(id, name, gioVao, gioRa));
        }

        //listCN.sort(Comparator.comparing(CongNhan::soPhut).reversed().thenComparing(CongNhan::getId));

        Collections.sort(listCN, new Comparator<CongNhan>() {
            public int compare(CongNhan o1, CongNhan o2) {
                if (o1.soPhut() < o2.soPhut()) {
                    return 1;
                } else if (o1.soPhut() > o2.soPhut()) {
                    return -1;
                } else {
                    return o1.getId().compareTo(o2.getId());
                }
            }
        });

        for (CongNhan cn : listCN) {
            System.out.println(cn);
        }

    }
}
/*
3
02T
Dang Duc Tai
08:00
17:00
01T
Nguyen Van An
08:00
17:00
06T
Tran Hoa Binh
09:05
17:00
 */