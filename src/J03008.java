import java.util.*;
import java.io.*;

/**
 * Create on 06/10/2024 20:09 by jayce
 */

public class J03008 {
    public static boolean isPrime(char c) {
        return c == '2' || c == '3' || c == '5' || c == '7';
    }
    public static boolean check(String s) {
        String temp = new StringBuilder(s).reverse().toString();
        for (int i = 0; i < s.length(); i++) {
            if (!isPrime(s.charAt(i))) {
                return false;
            }
        }
        return s.equals(temp);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String s = sc.nextLine();
            if (check(s)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
