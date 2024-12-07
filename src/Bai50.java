import java.math.BigInteger;
import java.util.*;
import java.io.*;

public class Bai50 {
    public static void main(String[] args) throws IOException, FileNotFoundException {
        Scanner sc = new Scanner(new File("DAYSO.in"));
        int n = Integer.parseInt(sc.nextLine());
        BigInteger maxRes = new BigInteger("0");
        BigInteger minRes = new BigInteger("0");
        BigInteger sum = new BigInteger("0");
        while (n-- > 0) {
            BigInteger bigInteger = new BigInteger(sc.nextLine());
            maxRes = maxRes.max(bigInteger);
            minRes = minRes.min(bigInteger);
            sum = sum.add(bigInteger);
        }
        System.out.println(minRes.toString() + "\n" + maxRes.toString() + "\n" + sum.toString());
    }
}
