package J05067;


import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<QuanLy> list = new ArrayList<>();
        while (n-- > 0) {
            String[] line = sc.nextLine().split("\\s+");
            String ma = line[0];
            int soLuong = Integer.parseInt(line[1]);
            list.add(new QuanLy(ma, soLuong));
        }
        for (QuanLy quanLy : list) {
            System.out.println(quanLy);
        }
    }
}
/*
4
N89BP 4500
D00BP 3500
X92SH 2600
X92TN 2600
 */