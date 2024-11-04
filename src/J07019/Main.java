package J07019;


import java.util.*;
import java.io.*;

/**
 * Create on 26/10/2024 08:53 by jayce
 */

public class Main {
    public static void main(String[] args) throws IOException, FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA1.in"));
        int a = Integer.parseInt(sc.nextLine());
        ArrayList<SP> listSP = new ArrayList<>();
        for (int i = 1; i <= a; i++) {
            SP sp = new SP(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine()));
            listSP.add(sp);
        }
        sc = new Scanner(new File("DATA2.in"));
        a = Integer.parseInt(sc.nextLine());
        ArrayList<HD> listHD = new ArrayList<>();
        for (int i = 1; i <= a; i++) {
            String[] line = sc.nextLine().split("\\s+");
            String id = line[0] + "-" + String.format("%03d", i);
            String temp = id.substring(0, 2);
            int count = Integer.parseInt(line[1]);
            SP sp = null;
            for (SP j : listSP) {
                if (j.getId().equals(temp)) {
                    sp = j;
                    break;
                }
            }
            HD hd = new HD(id, count, sp);
            listHD.add(hd);
        }
        for (HD hd : listHD) {
            System.out.println(hd);
        }
    }

}
