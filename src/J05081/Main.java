package J05081;


import java.util.*;

/**
 * Create on 09/10/2024 14:27 by jayce
 */

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<MatHang> list = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            String tenMh = sc.nextLine();
            String donVi = sc.nextLine();
            int giaMua = Integer.parseInt(sc.nextLine());
            int giaBan = Integer.parseInt(sc.nextLine());
            String idMh = "MH" + String.format("%03d", i+1);
            list.add(new MatHang(idMh, tenMh, donVi, giaMua,giaBan));
        }

        Collections.sort(list, new Sort());
        for (MatHang mh : list) {
            System.out.println(mh);
        }
    }
}
