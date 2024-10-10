package J07053;


import java.util.*;
import java.io.*;

/**
 * Create on 09/10/2024 13:35 by jayce
 */

public class Main {
    public static String chuanHoaTen(String s) {
        String[] words = s.trim().toLowerCase().split("\\s+");
        String val = "";
        for (int i = 0; i < words.length; i++) {
            val += words[i].substring(0, 1).toUpperCase() + words[i].substring(1) + " ";
        }
        val = val.substring(0, val.length() - 1);
        return val;
    }
    public static String chuanHoaNgaySinh(String s) {
        if (s.charAt(2) == '/') {
            s = "0" + s;
        }
        if (s.charAt(4) == '/') {
            s = s.substring(0, 3) + "0" + s.substring(3);
        }
        return s;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<PH> list = new ArrayList<>();
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; ++i) {
            String ten = chuanHoaTen(sc.nextLine());
            String ngaySinh = chuanHoaNgaySinh(sc.nextLine());
            Double diemLt = sc.nextDouble();
            Double diemTh = sc.nextDouble();
            String id = "PH" + String.format("%02d", i+1);
            list.add(new PH(id, ten, ngaySinh, diemLt, diemTh));
        }

        for (PH p : list) {
            System.out.println(p);
        }

    }
}
