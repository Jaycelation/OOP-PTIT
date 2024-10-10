import java.util.*;
import java.io.*;

/**
 * Create on 08/10/2024 20:52 by jayce
 */

public class J03029 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String s = sc.nextLine();
            StringBuilder res = new StringBuilder();
            String[] a = s.trim().split("\\s+");
            for (String x1 : a) {
                res.append(x1).append(" ");
            }
            res = new StringBuilder(res.toString().trim());
            res = new StringBuilder(res.toString().replace(" ?", "?"));
            res = new StringBuilder(res.toString().replace(" .", "."));
            res = new StringBuilder(res.toString().replace(" !", "!"));
            char x = res.charAt(res.length() - 1);
            if (x != '?' && x != '.' && x != '!') res.append(".");
            System.out.println(Character.toUpperCase(res.charAt(0)) + res.substring(1).toLowerCase());
        }
    }
}
