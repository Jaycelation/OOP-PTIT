package TH9;

import java.util.*;
import java.io.*;

/**
 * Create on 06/10/2024 13:40 by jayce
 */

/*9. LUYỆN TẬP LẬP TRÌNH
Input
LUYENTAP.in
Output
Nguyen Van Nam 168 600
Tran Thi Ngoc 168 600
 */

public class Main {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc = new Scanner(new File("LUYENTAP.in"));
        ArrayList<sinhVien> list = new ArrayList<>();
        int n = sc.nextInt();
        String hoTen;
        int soBai, soSub;
        for (int i = 1; i <= n; ++i) {
            sc.nextLine();
            hoTen = sc.nextLine();
            soBai = sc.nextInt();
            soSub = sc.nextInt();
            list.add(new sinhVien(hoTen, soBai, soSub));
        }
        Collections.sort(list, new Comparator<sinhVien>() {
            @Override
            public int compare(sinhVien o1, sinhVien o2) {
                if (o1.getSoBai() != o2.getSoBai()) {
                    if (o1.getSoBai() > o2.getSoBai()) {
                        return -1;
                    } else {
                        return 1;
                    }
                } else if (o1.getSoSub() != o2.getSoSub()) {
                    if (o1.getSoSub() < o2.getSoSub()) {
                        return -1;
                    } else {
                        return 1;
                    }
                } else {
                    return o1.getHoTen().compareTo(o2.getHoTen());
                }
            }
        });
        for (sinhVien sinhVien : list) {
            System.out.println(sinhVien);
        }
    }
}