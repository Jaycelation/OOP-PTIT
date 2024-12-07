package Contest;


import java.util.*;
import java.io.*;

public class Bai19 {
    public static void main(String[] args) throws IOException,FileNotFoundException {
        Scanner sc = new Scanner(new File("src/Contest/DANHSACH.in"));

        Map<String, Integer> map = new HashMap<>();
        Map<String, Boolean> check = new HashMap<>();
        while (sc.hasNextLine()) {
            String[] line = sc.nextLine().trim().toLowerCase().split("\\s+");
            String hoTen = line[line.length - 1];
            String temp = "";
            for (int i = 0; i < line.length; i++) {
                temp += line[i] + " ";
            }
            if (check.containsKey(temp) == false) {

            }
            check.put(temp, true);
            temp.substring(0, temp.length() - 1);
            map.put(hoTen, map.getOrDefault(hoTen, 0) + 1);
            for (int i = 0; i < line.length-1; ++i) {
                hoTen += line[i].substring(0, 1);
            }
            hoTen += map.get(temp);
            System.out.println(hoTen);
        }

    }
}
/*
    nGUYEn    quaNG   vInH
   tRan   thi THU    huOnG
   nGO   quoC  VINH
 lE            tuAn    aNH
NGO QUOC VINH
Tran THI THU huong
 */