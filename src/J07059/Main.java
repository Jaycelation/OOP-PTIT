package J07059;


import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws  IOException {
        Scanner scanner = new Scanner(new File("CATHI.in"));
        ArrayList<CaThi> list = new ArrayList<>();
        int n = Integer.parseInt(scanner.nextLine());
        int cnt = 1;
        while (n-- > 0) {
            list.add(new CaThi("C" + String.format("%03d", cnt++), scanner.nextLine(), scanner.nextLine(), scanner.nextLine()));
        }
        list.sort(Comparator.comparing(CaThi::getTime).thenComparing(CaThi::getMa));
        for (CaThi c : list) {
            System.out.println(c);
        }
    }
}
