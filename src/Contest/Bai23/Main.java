package Contest.Bai23;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, FileNotFoundException {
        Scanner sc = new Scanner(new File("ONLINE.in"));
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
