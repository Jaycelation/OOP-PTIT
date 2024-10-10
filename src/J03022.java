import java.util.*;
import java.io.*;

/**
 * Create on 06/10/2024 11:37 by jayce
 */

public class J03022 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder str = new StringBuilder();
        while (sc.hasNext()) {
            String s = sc.next();
            str.append(s).append(" ");
        }
        str = new StringBuilder(str.toString().replace('?', '.'));
        str = new StringBuilder(str.toString().replace('!', '.'));
        str = new StringBuilder(str.toString().replace(". ", "."));
        str = new StringBuilder(str.toString().replace(" . ", "."));
        str = new StringBuilder(str.toString().replace(" .", "."));
        String[] a = str.toString().trim().split("\\.");
        for (String x : a) {
            System.out.println(Character.toUpperCase(x.charAt(0)) + x.substring(1).toLowerCase());
        }
    }
}
