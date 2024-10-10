import java.util.*;
import java.io.*;

/**
 * Create on 06/10/2024 14:54 by jayce
 */

/*7. XỬ LÝ VĂN BẢN – 2
Input
VANBAN.in
PTIT duy tri hoc phi nam 2019 va khong tang hoc phi
trong nam 2020, 2021 va 2021 den 2022.
PTIT da trich 6 ty d0ong ho tro moi si1nh vien 500000!
Output
2019
2021
6
d0ong
si1nh
 */

public class TH7 {
    public static boolean check(String s) {
        boolean flag = true;
        for (int i = 0; i < s.length(); ++i) {
            char c = s.charAt(i);
            if (c >= '0' && c <= '9') {
                flag = false;
            }
        }
        for (int i = 0; i < s.length(); ++i) {
            char c = s.charAt(i);
            if (c == '.' || c == ',' || c == '!' || c == '?' || c == ':') {
                flag = true;
            }
        }
        return flag;
    }
    public static String fill(String s) {
        String[] words = s.trim().split("\\s+");
        String result = "";
        for (int i = 0; i < words.length; i++) {
            if (!check(words[i])) {
                result += words[i] + " ";
            }
        }
        return result;
    }
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("VANBAN.in"));
        TreeSet<String> treeSet = new TreeSet<>();
        while (sc.hasNextLine()) {
            String s = sc.nextLine();
            String[] words = fill(s).split("\\s+");
            for (int i = 0; i < words.length; i++) {
                treeSet.add(words[i]);
            }
        }
        for (String word : treeSet) {
            System.out.println(word);
        }
    }
}