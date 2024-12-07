package Contest.Bai13;


import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<SinhVien> list = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            list.add(new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }

        list.sort(Comparator.comparing(SinhVien::getMinutes).reversed().thenComparing(SinhVien::getTenSV));
        for (SinhVien sv : list) {
            System.out.println(sv);
        }
    }
}
/*
3
Do Viet Anh
11/12/2021 16:35:00
11/12/2021 17:35:00
Le Tuan Anh
11/12/2021 16:45:00
11/12/2021 18:15:00
Nguyen Tuan Anh
11/12/2021 17:00:00
11/12/2021 19:15:00
 */