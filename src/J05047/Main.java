package J05047;


import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        ArrayList<MatHang> list = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();
        while (n-- > 0) {
            String tenMH = scanner.nextLine();
            String[] words = tenMH.split("\\s+");
            String maMH = "";
            for (int i = 0; i < 2; i++) {
                maMH += words[i].substring(0, 1).toUpperCase();
            }
            int soLuong = Integer.parseInt(scanner.nextLine());
            int donGia = Integer.parseInt(scanner.nextLine());
            map.put(maMH, map.getOrDefault(maMH, 0) + 1);
            list.add(new MatHang(maMH + String.format("%02d", map.get(maMH)), tenMH, soLuong, donGia));
        }

        list.sort(Comparator.comparing(MatHang::getChietKhau).reversed());
        for (MatHang matHang : list) {
            System.out.println(matHang);
        }
    }
}
/*
3
May lanh SANYO
12
4000000
Dien thoai Samsung
30
3230000
Dien thoai Nokia
18
1240000
 */