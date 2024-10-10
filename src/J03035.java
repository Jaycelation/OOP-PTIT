import java.util.Scanner;

public class J03035 {
    public static int count = 0;
    public static void Try(String a, String b, int idx) {
        if (idx == a.length()) {
            if (a.compareTo(b) > 0) {
                count++;
            }
            return;
        }
        if (a.charAt(idx) == '?') {
            for (char digit = '0'; digit <= '9'; ++digit) {
                String newA = a.substring(0, idx) + digit + a.substring(idx+1);
                Try(newA, b, idx+1);
            }
        } else {
            Try(a, b, idx+1);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            String a = scanner.next();
            String b = scanner.next();
            count = 0;
            Try(a, b, 0);

            System.out.println(count);
        }
    }
}