import java.math.BigInteger;
import java.util.Scanner;

public class J03014 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigInteger s = new BigInteger(scanner.next());
        BigInteger w = new BigInteger(scanner.next());
        System.out.println(s.add(w));
    }
}
