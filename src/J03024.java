import java.util.*;
import java.io.*;

/**
 * Create on 08/10/2024 20:25 by jayce
 */

public class J03024 {
    public static int check(String s) {
        if (s.charAt(0) == '0') {
            return -1;
        }
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c < '0' || c > '9') {
                return -1;
            }
        }
        int demChan = 0, demLe = 0;
        for (int i = 0; i < s.length(); i++) {
            if ((s.charAt(i) - '0') % 2 == 0) {
                demChan++;
            } else {
                demLe++;
            }
        }
        if ((demChan > demLe && s.length() % 2 == 0) || (demChan < demLe && s.length() % 2 == 1)) {
            return 1;
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String s = sc.nextLine();
            if (check(s) == -1) {
                System.out.println("INVALID");
            } else if (check(s) == 1) {
                System.out.println("YES");
            } else if (check(s) == 0) {
                System.out.println("NO");
            }
        }
    }
}
