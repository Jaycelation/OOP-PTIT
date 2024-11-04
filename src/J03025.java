import java.util.*;
import java.io.*;

/**
 * Create on 18/10/2024 21:01 by jayce
 */

public class J03025 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            String s = sc.nextLine();
            int count = 0;
            for (int i = 0; i < s.length()/2; ++i) {
                if (s.charAt(i) != s.charAt(s.length()-i-1)) {
                    count++;
                }
            }
            if ((count == 1) || (count == 0 && s.length() % 2 == 1)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
