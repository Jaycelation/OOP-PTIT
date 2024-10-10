package J04003;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long tuSo = scanner.nextLong();
        long mauSo = scanner.nextLong();
        PhanSo phanSo = new PhanSo(tuSo, mauSo);

        phanSo.rutGon();
        System.out.println(phanSo.getTuSo() + "/" + phanSo.getMauSo());
    }
}
