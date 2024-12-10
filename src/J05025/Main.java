package J05025;


import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<GiangVien> list = new ArrayList<>();
        int n = Integer.parseInt(scanner.nextLine());
        int cnt = 1;
        while (n-- > 0) {
            list.add(new GiangVien("GV" + String.format("%02d", cnt++), scanner.nextLine(), scanner.nextLine()));
        }

        list.sort(Comparator.comparing(GiangVien::getTenGV).thenComparing(GiangVien::getMaGV));
        for (GiangVien giangVien : list) {
            System.out.println(giangVien);
        }
    }
}
