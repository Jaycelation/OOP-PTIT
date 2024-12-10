package J05029;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<DoanhNghiep> list = new ArrayList<>();
        int n = Integer.parseInt(scanner.nextLine());
        while (n-- > 0) {
            list.add(new DoanhNghiep(scanner.nextLine(), scanner.nextLine(), Integer.parseInt(scanner.nextLine())));
        }
        list.sort(Comparator.comparing(DoanhNghiep::getSoSV).reversed().thenComparing(DoanhNghiep::getMaDN));
        n = Integer.parseInt(scanner.nextLine());
        while (n-- > 0) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            System.out.println("DANH SACH DOANH NGHIEP NHAN TU " + a + " DEN " + b + " SINH VIEN:");

            for (DoanhNghiep doanhNghiep : list) {
                if (doanhNghiep.getSoSV() >= a && doanhNghiep.getSoSV() <= b) {
                    System.out.println(doanhNghiep);
                }
            }
        }
    }
}
/*
4
VIETTEL
TAP DOAN VIEN THONG QUAN DOI VIETTEL
40
FSOFT
CONG TY TNHH PHAN MEM FPT - FPT SOFTWARE
300
VNPT
TAP DOAN BUU CHINH VIEN THONG VIET NAM
200
SUN
SUN*
50
1
30 50
 */
