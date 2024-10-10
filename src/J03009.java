import java.util.*;
import java.io.*;

/**
 * Create on 06/10/2024 20:12 by jayce
 */

public class J03009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String s = sc.nextLine();
            String w = sc.nextLine();
            String[] group1 = s.split("\\s+");
            String[] group2 = w.split("\\s+");

            Set<String> set1 = new HashSet<>(Arrays.asList(group1));
            Set<String> set2 = new HashSet<>(Arrays.asList(group2));

            Set<String> unique1 = new HashSet<>(set1);
            Set<String> unique2 = new HashSet<>(set2);

            unique1.removeAll(unique2); //Chi xuat hien trong s1
            unique2.removeAll(unique1); //Chi xuat hien trong s2

            Set<String> set = new HashSet<>(unique1);
            for (String element : set) {
                System.out.printf(element + " ");
            }
            System.out.println();
        }
    }
}
