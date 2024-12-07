package Contest.Bai52;


import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, FileNotFoundException{
        Scanner scanner = new Scanner(new File("DANHSACH.in"));
        ArrayList<SinhVien> list = new ArrayList<>();
        while (scanner.hasNextLine()) {
            String maSV = scanner.nextLine();
            String tenSV = scanner.nextLine();
            String lop = scanner.nextLine();
            String gmail = scanner.nextLine();
            String sdt = "0" + scanner.nextLine();
            list.add(new SinhVien(maSV, tenSV, lop, gmail, sdt));
        }
        list.sort(Comparator.comparing(SinhVien::getLop).thenComparing(SinhVien::getMaSV));
        for (SinhVien sv : list) {
            System.out.println(sv);
        }
    }
}
