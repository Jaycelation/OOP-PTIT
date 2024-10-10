import java.util.*;
import java.io.*;

/**
 * Create on 06/10/2024 20:03 by jayce
 */

public class J03007 {
    public static boolean check(String s) {
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            sum += s.charAt(i)-'0';
        }
        String reversed = new StringBuilder(s).reverse().toString();
        return (sum % 10 == 0) && (s.charAt(0) == '8' && s.charAt(s.length()-1) == '8') && (s.equals(reversed) == true);
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
