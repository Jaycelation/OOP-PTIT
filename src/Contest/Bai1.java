package Contest;

import java.util.*;
import java.io.*;

public class Bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String res = "";
        int val = 0;

        while (scanner.hasNext()) {
            String word = scanner.next();
            if (word.length() > val) {
                res = word;
                val = word.length();
            }
        }
        System.out.println(res + " - " + val);
    }
}