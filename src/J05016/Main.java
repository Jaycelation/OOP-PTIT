package J05016;

import java.util.*;
import java.io.*;

/**
 * Create on 02/11/2024 22:04 by jayce
 */

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<KS> listKs = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 1; i <= n; i++) {
            String id = "KH" + String.format("%02d", i);
            String name = sc.nextLine();
            String rooms = sc.nextLine();
            String dateStart = sc.nextLine();
            String dateEnd = sc.nextLine();
            int service  = Integer.parseInt(sc.nextLine());
            KS ks = new KS(id, name, rooms, dateStart, dateEnd, service);
            listKs.add(ks);
        }

        listKs.sort(Comparator.comparing(KS::getTotal).reversed());

        for (KS k : listKs) {
            System.out.println(k);
        }

    }
}
/*
3
Huynh Van Thanh
103
05/06/2010
05/06/2010
15
Le Duc Cong
106
08/03/2010
01/05/2010
220
Tran Thi Bich Tuyen
207
10/04/2010
21/04/2010
96
 */