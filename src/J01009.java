import java.util.*;
import java.io.*;

public class J01009 {
    public static long[] dp = new long[21];
    public static long giaiThua(int n) {
        long ans = 1;
        for (int i = 1; i <= n; ++i) {
            ans *= i;
        }
        return ans;
    }
    public static void init() {
        dp[0] = 0;
        dp[1] = 1;
        for (int i = 2; i <= 20; ++i) {
            long val = giaiThua(i);
            dp[i] = val + dp[i-1];
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        init();
        int n = scanner.nextInt();
        System.out.println(dp[n]);
    }
}
