package J07073;


import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(new File("MONHOC.in"));
        ArrayList<MonHoc> list = new ArrayList<>();
        int n = Integer.parseInt(scanner.nextLine());
        while (n-- > 0) {
            String maMH = scanner.nextLine();
            String tenMH = scanner.nextLine();
            int soTC = Integer.parseInt(scanner.nextLine());
            String hinhThucLT = scanner.nextLine();
            String hinhThucTH = scanner.nextLine();
            if (hinhThucLT.equals("Truc tuyen") || (hinhThucLT.equals("Truc tiep") && (hinhThucTH.equals("Truc tuyen") || hinhThucTH.contains(".ptit.edu.vn")))) {
                list.add(new MonHoc(maMH, tenMH, soTC, hinhThucLT, hinhThucTH));
            }
        }

        list.sort(Comparator.comparing(MonHoc::getMaMH));
        for (MonHoc i : list) {
            System.out.println(i);
        }
    }
}
