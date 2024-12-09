package J07037;


import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("DN.in"));
        ArrayList<DoanhNghiep> list = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        while (n-- > 0) {
            list.add(new DoanhNghiep(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine())));
        }

        list.sort(Comparator.comparing(DoanhNghiep::getMaDN));
        for (DoanhNghiep dn : list) {
            System.out.println(dn);
        }
    }
}
