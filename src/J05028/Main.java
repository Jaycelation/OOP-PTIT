package J05028;


import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<DoanhNghiep> list = new ArrayList<>();
        int n = Integer.parseInt(scanner.nextLine());
        while (n-- > 0) {
            list.add(new DoanhNghiep(scanner.nextLine(), scanner.nextLine(), Integer.parseInt(scanner.nextLine())));
        }
        list.sort(Comparator.comparing(DoanhNghiep::getSoSV).reversed().thenComparing(DoanhNghiep::getMaDN));

        for (DoanhNghiep doanhNghiep : list) {
            System.out.println(doanhNghiep);
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
 */
