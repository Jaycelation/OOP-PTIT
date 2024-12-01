package KT3;


import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, FileNotFoundException {
        Scanner scanner = new Scanner(new File("DANHSACH.in"));
        ArrayList<SinhVien> listSV = new ArrayList<>();
        while (scanner.hasNextLine()) {
            String maSV = scanner.nextLine();
            String tenSV = scanner.nextLine();
            String lopSV = scanner.nextLine();
            String gmailSV = scanner.nextLine();
            String sdtSV = scanner.nextLine();
            if (sdtSV.length() != 10) {
                sdtSV = "0" + sdtSV;
            }
            listSV.add(new SinhVien(maSV, tenSV, lopSV, gmailSV, sdtSV));
        }
        listSV.sort(Comparator.comparing(SinhVien::getLopSV).thenComparing(SinhVien::getMaSV));
        for (SinhVien sv : listSV) {
            System.out.println(sv);
        }
    }
}
