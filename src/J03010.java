import java.util.*;
import java.io.*;

/**
 * Create on 06/10/2024 20:23 by jayce
 */

public class J03010 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        Map<String, Integer> map = new LinkedHashMap<>();
        LinkedHashSet<String> set = new LinkedHashSet<>();
        while (t-- > 0) {
            String s = sc.nextLine();
            String[] words = s.trim().split("\\s+");
            String result = "";
            for (int i = 0; i < words.length; i++) {
                words[i] = words[i].toLowerCase();
                result += words[i] + " ";
            }
            result = result.substring(0, result.length() - 1);
            set.add(result);
        }

        for (String word : set) {
            String temp = "";
            String[] words = word.trim().split("\\s+");
            temp += words[words.length - 1];
            for (int i = 0; i < words.length-1; i++) {
                temp += words[i].charAt(0);
            }
            if (map.containsKey(temp)) {
                map.put(temp, map.get(temp) + 1);
                System.out.println(temp + map.get(temp) + "@ptit.edu.vn");
            } else {
                map.put(temp, 1);
                System.out.println(temp + "@ptit.edu.vn");
            }
        }

    }
}
