import java.util.*;
import java.io.*;

public class J03004 {
    public static String chuanHoa(String s) {
        String[] words = s.trim().split("\\s+");
        String result = "";

        for (int i = 0; i < words.length; i++) {
            words[i] = words[i].toLowerCase();
            result += words[i].substring(0, 1).toUpperCase() + words[i].substring(1) + " ";
        }
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
