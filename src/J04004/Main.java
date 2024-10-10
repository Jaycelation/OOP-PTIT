package J04004;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long a = scanner.nextLong();
        long b = scanner.nextLong();
        long c = scanner.nextLong();
        long d = scanner.nextLong();

        PhanSo p = new PhanSo(a, b);
        PhanSo q = new PhanSo(c, d);

        p.tinhTong(q);
        System.out.println(p.getTuSo() + "/" + p.getMauSo());
    }
}
