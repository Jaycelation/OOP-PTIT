import java.util.*;

public class J03028 {
    public static String rotate(String s) {
        int sum = 0;
        for (char c : s.toCharArray()) {
            sum += c - 'A';
        }
        int shift = sum % 26;
        StringBuilder rotated = new StringBuilder();
        for (char c : s.toCharArray()) {
            char rotatedChar = (char) ((c - 'A' + shift) % 26 + 'A');
            rotated.append(rotatedChar);
        }
        return rotated.toString();
    }
    public static String merge(String s1, String s2) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s1.length(); i++) {
            int shift = s2.charAt(i) - 'A';
            char mergedChar = (char) ((s1.charAt(i) - 'A' + shift) % 26 + 'A');
            result.append(mergedChar);
        }
        return result.toString();
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            String s = scanner.next();
            int mid = s.length() / 2;
            String s1 = s.substring(0, mid);
            String s2 = s.substring(mid);

            String rotatedS1 = rotate(s1);
            String rotatedS2 = rotate(s2);
            String result = merge(rotatedS1, rotatedS2);
            System.out.println(result);
        }
    }
}
