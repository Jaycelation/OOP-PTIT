import java.math.BigInteger;
import java.util.*;
import java.io.*;

/**
 * Create on 06/10/2024 20:33 by jayce
 */

public class J03011 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            BigInteger a = sc.nextBigInteger();
            BigInteger b = sc.nextBigInteger();
            System.out.println(a.gcd(b));
        }
    }
}
