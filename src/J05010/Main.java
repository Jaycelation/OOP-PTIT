package J05010;


import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int id = 1;
        ArrayList<MatHang> listMH = new ArrayList<>();
        while (n-- > 0) {
            String tenMH = sc.nextLine();
            String nhomH = sc.nextLine();
            double giaMua = Double.parseDouble(sc.nextLine());
            double giaBan = Double.parseDouble(sc.nextLine());
            listMH.add(new MatHang(id, tenMH, nhomH, giaMua,giaBan));
            id += 1;
        }
        listMH.sort(Comparator.comparing(MatHang::getLoiNhuan).reversed());
        for (MatHang m : listMH) {
            System.out.println(m);
        }
    }
}
/*
3
May tinh SONY VAIO
Dien tu
16400
17699
Tu lanh Side by Side
Dien lanh
18300
25999
Banh Chocopie
Tieu dung
27.5
37
 */