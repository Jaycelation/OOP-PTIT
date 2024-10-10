package TH10;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.io.*;

/**
 * Create on 06/10/2024 14:16 by jayce
 */

/*10. THỐNG KÊ THỜI GIAN
Input
ONLINE.in
Output
Nguyen Tuan Anh 135
Le Tuan Anh 90
Do Viet Anh 60
 */

public class Main {
    public static void main(String[] args) throws FileNotFoundException, ParseException{
        Scanner sc = new Scanner(new File("ONLINE.in"));
        ArrayList<sinhVien> list = new ArrayList<>();
        int n = sc.nextInt();
        String name, dayStart, dayEnd;
        int time;
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            name = sc.nextLine();
            dayStart = sc.nextLine();
            dayEnd = sc.nextLine();
            SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
            Date start = format.parse(dayStart);
            Date end = format.parse(dayEnd);
            long val = end.getTime() - start.getTime();
            time = (int) (val / (1000*60));
            list.add(new sinhVien(name, dayStart, dayEnd, time));
        }
        Collections.sort(list, new Comparator<sinhVien>() {
            @Override
            public int compare(sinhVien o1, sinhVien o2) {
                if (o1.getTime() != o2.getTime()) {
                    if (o1.getTime() > o2.getTime()) {
                        return -1;
                    } else {
                        return 1;
                    }
                } else {
                    return o1.getName().compareTo(o2.getName());
                }
            }
        });
        for (sinhVien v : list) {
            System.out.println(v);
        }
    }
}