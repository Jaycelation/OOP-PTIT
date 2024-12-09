package J07072;


import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, FileNotFoundException {
        Scanner scanner = new Scanner(new File("DANHSACH.in"));
        ArrayList<HoTen> list = new ArrayList<>();
        while (scanner.hasNextLine()) {
            list.add(new HoTen(scanner.nextLine()));
        }

        list.sort(Comparator.comparing(HoTen::getTen).thenComparing(HoTen::getHo).thenComparing(HoTen::getTenDem));
        for (HoTen h : list) {
            System.out.println(h);
        }

    }
}
