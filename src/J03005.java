import java.util.*;
import java.io.*;

/**
 * Create on 06/10/2024 19:55 by jayce
 */

public class J03005 {
    public static String chuanHoa(String s) {
        String[] words = s.split("\\s+");
        String result = "";
        for (int i = 1; i < words.length; i++) {
            words[i] = words[i].toLowerCase();
            result += words[i].substring(0, 1).toUpperCase() + words[i].substring(1) + " ";
        }
        result = result.substring(0, result.length() - 1);
        result += ", " + words[0].toUpperCase();
        return result;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();
        while (t-- > 0) {
            String s = scanner.nextLine().trim();
            System.out.println(chuanHoa(s));
        }
    }
}
