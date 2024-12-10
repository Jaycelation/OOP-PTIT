package J07048;


import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("SANPHAM.in"));
        ArrayList<SanPham> list = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        while (n-- > 0) {
            list.add(new SanPham(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine())));
        }
        list.sort(Comparator.comparing(SanPham::getGiaBan).reversed().thenComparing(SanPham::getMaSP));
        for (SanPham sanPham : list) {
            System.out.println(sanPham);
        }
    }
}
