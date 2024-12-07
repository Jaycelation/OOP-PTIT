package Contest;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.math.BigInteger;
import java.util.Scanner;

public class Bai50 {
    public static void main(String[] args) throws IOException, FileNotFoundException {
        Scanner sc = new Scanner(new File("DAYSO.in"));
        int n = Integer.parseInt(sc.nextLine());

        BigInteger maxRes = BigInteger.ZERO;
        BigInteger minRes = null;
        BigInteger sum = BigInteger.ZERO;

        while (n-- > 0) {
            BigInteger bigInteger = new BigInteger(sc.nextLine());
            if (minRes == null) {
                minRes = bigInteger;
            }
            maxRes = maxRes.max(bigInteger);
            minRes = minRes.min(bigInteger);
            sum = sum.add(bigInteger);
        }

        System.out.println(minRes.toString());
        System.out.println(maxRes.toString());
        System.out.println(sum.toString());
    }
}
