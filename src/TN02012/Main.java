package TN02012;


import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        ArrayList<PhongBan> listPB = new ArrayList<>();
        while (n-- > 0) {
            String[] line = scanner.nextLine().split("\\s+");
            String maPB = line[0];
            String tenPB = "";
            for (int i = 1; i < line.length; i++) {
                tenPB += line[i];
                if (i != line.length - 1) {
                    tenPB += " ";
                }
            }
            listPB.add(new PhongBan(maPB, tenPB));
        }

        n = Integer.parseInt(scanner.nextLine());
        ArrayList<NhanVien> listNV = new ArrayList<>();
        while (n-- > 0) {
            String maNV = scanner.nextLine();
            String tenNV = scanner.nextLine();
            int luongCB = Integer.parseInt(scanner.nextLine());
            int soNgayCong = Integer.parseInt(scanner.nextLine());
            PhongBan phongBan = null;
            for (PhongBan pb : listPB) {
                if (pb.getMaPB().equals(maNV.substring(3, 5))) {
                    phongBan = pb;
                    break;
                }
            }
            listNV.add(new NhanVien(maNV, tenNV, luongCB, soNgayCong, phongBan));
        }

        for (NhanVien nv : listNV) {
            System.out.println(nv);
        }

    }
}
/*
2
HC Hanh chinh
KH Ke hoach Dau tu
2
C06HC
Tran Binh Minh
65
25
D03KH
Le Hoa Binh
59
24
 */