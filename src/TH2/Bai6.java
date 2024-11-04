import java.math.BigInteger;
import java.util.*;
import java.io.*;

/**
 * Create on 03/11/2024 13:01 by jayce
 */

public class Bai6 {
    public static void main(String[] args) throws IOException, FileNotFoundException {
        Scanner sc = new Scanner(new File("DAYSO.in"));
        int n = sc.nextInt();
        BigInteger[] arr = new BigInteger[n];
        BigInteger sum = new BigInteger("0");
        for (int i = 0; i < n; i++) {
            BigInteger bi = new BigInteger(sc.next());
            arr[i] = bi;
            sum = sum.add(bi);
        }
        Arrays.sort(arr);
        System.out.println(arr[0]);
        System.out.println(arr[arr.length - 1]);
        System.out.println(sum.toString());
    }
}
