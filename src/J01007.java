import java.util.*;
public class J01007 {
    public static long[] fibo = new long[93];
    public static void fibonacci() {
        fibo[1] = fibo[2] = 1;
        for (int i = 3; i <= 92; ++i) {
            fibo[i] = fibo[i-1] + fibo[i-2];
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        fibonacci();
        while (t-- > 0) {
            long n = scanner.nextLong();
            System.out.println(Arrays.binarySearch(fibo, n) >= 0 ? "YES" : "NO");
        }
    }
}
