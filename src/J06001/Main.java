package J06001;


import java.util.*;
import java.io.*;

/**
 * Create on 27/10/2024 12:56 by jayce
 */

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<SP> listSP = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            SP sp = new SP(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine()));
            listSP.add(sp);
        }

        int m = Integer.parseInt(sc.nextLine());
        ArrayList<HD> listHD = new ArrayList<>();
        for (int i = 1; i <= m; i++) {
            String[] line = sc.nextLine().split("\\s+");
            String id = line[0];
            int count = Integer.parseInt(line[1]);
            SP sp = null;
            for (SP s : listSP) {
                if (id.substring(0,2).equals(s.getId())) {
                    sp = s;
                    break;
                }
            }
            HD hd = new HD(id + "-" + String.format("%03d", i), count, sp);
            listHD.add(hd);
        }
        for (HD hd : listHD) {
            System.out.println(hd);
        }
    }
}
/*
2
AT
Ao thun
80000
45000
QJ
Quan Jean
220000
125000
2
AT1 95
QJ2 105
 */