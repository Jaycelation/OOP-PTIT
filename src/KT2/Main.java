package KT2;


import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        ArrayList<CongNhan> listCN = new ArrayList<>();
        while (n-- > 0) {
            String maCN = scanner.nextLine();
            String tenCN = scanner.nextLine();
            String gioVao = scanner.nextLine();
            String gioRa = scanner.nextLine();
            listCN.add(new CongNhan(maCN, tenCN, gioVao, gioRa));
        }

        listCN.sort(Comparator.comparing(CongNhan::getThoiGian).reversed().thenComparing(CongNhan::getMaCN));
        for (CongNhan congNhan : listCN) {
            System.out.println(congNhan);
        }

    }
}
/*
2
01T
Nguyen Van An
08:00
17:30
06T
Tran Hoa Binh
09:05
17:00
 */