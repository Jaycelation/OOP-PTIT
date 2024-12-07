package Contest;


import java.util.*;
import java.io.*;

public class Bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        while (n-- > 0) {
            String s = scanner.nextLine();
            int val = 0;
            ArrayList<String> list = new ArrayList<>();
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (c - '0' >= 0 && c - '0' <= 9) {
                    val += (c - '0');
                } else {
                    list.add(c + "");
                }
            }
            Collections.sort(list);
            list.add(String.valueOf(val));
            for (int i = 0; i < list.size(); i++) {
                System.out.print(list.get(i));
            }
            System.out.println();
        }
    }
}
/*
2
AC2BEW3
ACCBA10D2EW30
 */