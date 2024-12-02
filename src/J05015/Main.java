package J05015;


import java.text.SimpleDateFormat;
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        ArrayList<Cuaro> listC = new ArrayList<>();
        while (n-- > 0) {
            String ma = "";
            String hoTen = scanner.nextLine();
            String donVi = scanner.nextLine();
            String[] word1 = hoTen.toUpperCase().split("\\s+");
            String[] word2 = donVi.toUpperCase().split("\\s+");
            for (int i = 0; i < word2.length; i++) {
                ma += word2[i].charAt(0);
            }
            for (int i = 0; i < word1.length; i++) {
                ma += word1[i].charAt(0);
            }
            String thoiDiem = scanner.nextLine();
            listC.add(new Cuaro(ma, hoTen, donVi, thoiDiem));
        }

        listC.sort(Comparator.comparing(Cuaro::getTime));

        for (Cuaro c : listC) {
            System.out.println(c);
        }

    }
}
/*
3
Tran Vu Minh
Ha Noi
8:30
Vu Ngoc Hoang
Hoa Binh
8:20
Pham Dinh Tan
An Giang
8:45
 */