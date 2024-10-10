import java.math.BigInteger;
import java.util.Scanner;

public class J03012 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            BigInteger s = new BigInteger(scanner.next());
            BigInteger w = new BigInteger(scanner.next());
            System.out.println(s.add(w));
        }
    }
}
