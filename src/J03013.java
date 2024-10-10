import java.math.BigInteger;
import java.util.Scanner;

public class J03013 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            String a = scanner.next();
            String b = scanner.next();
            BigInteger x = new BigInteger(a), y = new BigInteger(b);
            BigInteger result = (x.subtract(y)).abs();
            StringBuilder ans = new StringBuilder(result.toString());
            int tmp = Math.max(a.length(), b.length());
            while (ans.length() < tmp) {
                ans.insert(0, "0");
            }
            System.out.println(ans);
        }
    }
}
