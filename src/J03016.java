import java.util.Scanner;

public class J03016 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();
        while (t-- > 0) {
            String s = scanner.next();

            int sum = 0;
            for (int i = 0; i < s.length(); ++i) {
                if (i % 2 == 0) {
                    sum += s.charAt(i)-'0';
                }
                else {
                    sum -= s.charAt(i)-'0';
                }
            }
            if (sum % 11 == 0) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }

    }
}
