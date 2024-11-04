package J06006;

import java.util.*;
import java.io.*;

/**
 * Create on 26/10/2024 18:56 by jayce
 */

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.nextLine());
        ArrayList<KH> listKH = new ArrayList<>();
        for (int i = 1; i <= a; i++) {
            KH kh = new KH("KH" + String.format("%03d", i), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            listKH.add(kh);
        }
        ArrayList<MH> listMH = new ArrayList<>();
        int b = Integer.parseInt(sc.nextLine());
        for (int i = 1; i <= b; i++) {
            MH mh = new MH("MH" + String.format("%03d", i), sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine()));
            listMH.add(mh);
        }
        int c = Integer.parseInt(sc.nextLine());
        ArrayList<HD> listHD = new ArrayList<>();
        for (int i = 1; i <= c; i++) {
            String[] line = sc.nextLine().split("\\s+");
            String idKH = line[0];
            String idMH = line[1];
            int count = Integer.parseInt(line[2]);
            KH kh = null;
            MH mh = null;
            for (KH k : listKH) {
                if (k.getId().equals(idKH)) {
                    kh = k;
                    break;
                }
            }
            for (MH m : listMH) {
                if (m.getId().equals(idMH)) {
                    mh = m;
                    break;
                }
            }
            HD hd = new HD("HD" + String.format("%03d", i), kh, mh, count);
            listHD.add(hd);
        }
        listHD.sort(Comparator.comparing(HD::getProfit).reversed());
        for (HD hd : listHD) {
            System.out.println(hd);
        }
    }
}