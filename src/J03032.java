import java.util.*;
import java.io.*;

/**
 * Create on 08/10/2024 20:35 by jayce
 */

public class J03032 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String s = sc.nextLine();
            String[] words = s.split("\\s+");
            for (int i = 0; i < words.length; i++) {
                StringBuilder str = new StringBuilder(words[i]);
                str.reverse();
                words[i] = str.toString();
            }
            for (int i = 0; i < words.length; i++) {
                System.out.print(words[i] + " ");
            }
            System.out.println();
        }
    }
}
