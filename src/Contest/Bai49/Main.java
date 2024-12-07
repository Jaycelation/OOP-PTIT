package Contest.Bai49;


import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("MONHOC.in"));
        ArrayList<MonHoc> list = new ArrayList<>();
        Map<String, Boolean> map = new HashMap<>();
        while (sc.hasNextLine()) {
            String maMH = sc.nextLine();
            String tenMH = sc.nextLine();
            String hinhThucThi = sc.nextLine();
            if (map.containsKey(maMH) == false) {
                map.put(maMH, true);
                list.add(new MonHoc(maMH, tenMH, hinhThucThi));
            }
        }
        list.sort(Comparator.comparing(MonHoc::getMaMH));
        for (MonHoc monHoc : list) {
            System.out.println(monHoc);
        }
    }
}
