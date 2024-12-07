package Contest.Bai12;


import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, m;
        String[] line = sc.nextLine().split("\\s+");
        n = Integer.parseInt(line[0]);
        m = Integer.parseInt(line[1]);
        ArrayList<String> listTL = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String theLoai = sc.nextLine();
            listTL.add(theLoai);
        }
        int cnt = 1;
        ArrayList<Phim> listP = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            String maP = "P" + String.format("%03d", cnt++);
            String maTL = sc.nextLine();
            String ngayChieu = sc.nextLine();
            String tenPhim = sc.nextLine();
            int soTap = Integer.parseInt(sc.nextLine());
            String tenTL = "";
            int theLoai = Integer.parseInt(maTL.substring(2));
            tenTL = listTL.get(theLoai-1);
            listP.add(new Phim(maP, tenPhim, tenTL, ngayChieu, soTap));
        }
        listP.sort(Comparator.comparing(Phim::getNgayChieu).thenComparing(Phim::getTenPhim).thenComparing(Phim::getSoTap));
        for (Phim p : listP) {
            System.out.println(p);
        }

    }
}
/*
2 3
Hai huoc
Tinh cam
TL001
25/11/2021
Phim so 1
10
TL001
04/12/2021
Phim so 2
15
TL002
25/11/2021
Phim so 3
5
 */