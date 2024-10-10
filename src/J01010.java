import java.util.*;
import java.io.*;

public class J01010 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();
        while (t-- > 0) {
            String s = scanner.nextLine();
            int flag = 1, count = 0;
            String result = "";
            for (int i = 0; i < s.length(); ++i) {
                if (s.charAt(i) == '0' || s.charAt(i) == '8' || s.charAt(i) == '9') {
                    result += '0'; count++;
                } else if (s.charAt(i) == '1') {
                    result += '1';
                } else {
                    flag = 0;
                    break;
                }
            }

            if (count == result.length()) {
                System.out.println("INVALID");
            } else {
                System.out.println(Long.parseLong(result));
            }

        }
    }
}