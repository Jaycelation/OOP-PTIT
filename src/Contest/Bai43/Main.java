package Contest.Bai43;


import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(new File("MONHOC.in"));
        ArrayList<MonHoc> list = new ArrayList<>();
        int n = Integer.parseInt(scanner.nextLine());
        while (n-- > 0) {
            list.add(new MonHoc(scanner.nextLine(), scanner.nextLine(), Integer.parseInt(scanner.nextLine())));
        }
        list.sort(Comparator.comparing(MonHoc::getTenMH));
        for (MonHoc mh : list) {
            System.out.println(mh);
        }
    }
}
