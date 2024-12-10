package J07050;


import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("MATHANG.in"));
        ArrayList<MatHang> list = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        int cnt = 1;
        while (n-- > 0) {
            list.add(new MatHang("MH" + String.format("%02d", cnt++), sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine())));
        }

        list.sort(Comparator.comparing(MatHang::getLoiNhuan).reversed());

        for (MatHang hang : list) {
            System.out.println(hang);
        }

    }
}
