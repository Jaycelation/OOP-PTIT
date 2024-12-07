package Contest;


import java.util.*;
import java.io.*;

public class Bai4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        while (n-- > 0) {
            String s = scanner.nextLine();
            long tich = 1;
            long tong = 0;
            for (int i = 0; i < s.length(); i++) {
                if (i % 2 != 0) {
                    tong += (s.charAt(i) - '0');
                } else {
                    if (s.charAt(i) - '0' != 0) {
                        tich *= (s.charAt(i) - '0');
                    }
                }
            }
            System.out.println(tich + " " + tong);
        }
    }
}
/*
3
12345678
20000
22334455667788
 */
