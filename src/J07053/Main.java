package J07053;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(new File("XETTUYEN.in"));
        ArrayList<PH> list = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        int cnt = 1;
        for (int i = 0; i < n; ++i) {
            list.add(new PH("PH" + String.format("%02d", cnt++), sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine())));
        }

        for (PH p : list) {
            System.out.println(p);
        }

    }
}