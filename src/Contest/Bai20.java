package Contest;


import java.util.*;
import java.io.*;

public class Bai20 {
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
