package Contest.Bai22;


import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, FileNotFoundException {
        Scanner sc = new Scanner(new File("LUYENTAP.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<SinhVien> list = new ArrayList<>();
        while (n-- > 0) {
            String tenSV = sc.nextLine();
            String[] line = sc.nextLine().split("\\s+");
            int baiDung = Integer.parseInt(line[0]);
            int soSub = Integer.parseInt(line[1]);
            list.add(new SinhVien(tenSV, baiDung, soSub));
        }

        list.sort(Comparator.comparing(SinhVien::getBaiDung).reversed().thenComparing(SinhVien::getSoSub).thenComparing(SinhVien::getTenSV));
        for (SinhVien sv : list) {
            System.out.println(sv);
        }
    }
}
