import java.math.BigInteger;
import java.util.Scanner;

public class J03015 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.next();
        String b = scanner.next();
        BigInteger x = new BigInteger(a), y = new BigInteger(b);
        BigInteger result = x.subtract(y);
        StringBuilder ans = new StringBuilder(result.toString());
        int tmp = Math.max(a.length(), b.length());
        System.out.println(ans);
    }
}
