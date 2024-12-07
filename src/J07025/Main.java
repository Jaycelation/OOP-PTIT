package J07025;


import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, FileNotFoundException {
        Scanner scanner = new Scanner(new File("KHACHHANG.in"));
        ArrayList<KhachHang> list = new ArrayList<>();
        int n = Integer.parseInt(scanner.nextLine());
        int cnt = 1;
        while (n-- > 0) {
            list.add(new KhachHang("KH" + String.format("%03d", cnt++), scanner.nextLine(), scanner.nextLine(), scanner.nextLine(), scanner.nextLine()));
        }

        list.sort(Comparator.comparing(KhachHang::getTime));
        for (KhachHang khachHang : list) {
            System.out.println(khachHang);
        }
    }
}
