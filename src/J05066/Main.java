package J05066;


import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        ArrayList<NhanVien> listNV = new ArrayList<>();
        while (n-- > 0) {
            String[] input = scanner.nextLine().split("\\s+");
            String maNV = input[0];
            String hoTen = "";
            for (int i = 1; i < input.length; i++) {
                hoTen += input[i];
                if (i != input.length - 1) {
                    hoTen += " ";
                }
            }
            String chucVu = maNV.substring(0, 2);
            int shNV = Integer.parseInt(maNV.substring(4));
            if((shNV > 1 && chucVu.equals("GD")) || (shNV > 3 && chucVu.equals("TP") || (shNV > 3 && chucVu.equals("PP")))){
                String temp = "NV" + maNV.substring(2);
                maNV = temp;
            }
            listNV.add(new NhanVien(maNV, hoTen));
        }

        listNV.sort(Comparator.comparing(NhanVien::getHsLuong).reversed().thenComparing(NhanVien::getShNV));

        n = Integer.parseInt(scanner.nextLine());
        while (n-- > 0) {
            String ten = scanner.nextLine().trim();
            for (NhanVien x : listNV) {
                if (x.getTenNV().toLowerCase().contains(ten.toLowerCase())) {
                    System.out.println(x);
                }
            }
            System.out.println();
        }

    }
}
