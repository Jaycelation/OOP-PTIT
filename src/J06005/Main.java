package J06005;


import java.util.*;
import java.io.*;

/**
 * Create on 27/10/2024 12:43 by jayce
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

        int b = Integer.parseInt(sc.nextLine());
        ArrayList<MH> listMH = new ArrayList<>();
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
            String count = line[2];
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
            HD hd = new HD("HD" + String.format("%03d", i), Integer.parseInt(count), kh, mh);
            listHD.add(hd);
        }
        for (HD hd : listHD) {
            System.out.println(hd);
        }
    }
}
/*
2
Nguyen Van Nam
Nam
12/12/1997
Mo Lao-Ha Dong-Ha Noi
Tran Van Binh
Nam
11/14/1995
Phung Khoang-Nam Tu Liem-Ha Noi
2
Ao phong tre em
Cai
25000
41000
Ao khoac nam
Cai
240000
515000
3
KH001 MH001 2
KH001 MH002 3
KH002 MH002 4
 */