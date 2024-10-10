import java.util.*;

public class J01013 {
    public static int[] dp = new int[2000001];
    public static void sieve() {
        dp[1] = 1;
        for (int i = 2; i <= Math.sqrt(2000000); ++i) {
            for (int j = i*i; j <= 2000000; j += i) {
                if (dp[i] == 0) {
                    dp[j] = i;
                }
            }
        }
        for (int i = 2; i <= 2000000; ++i) {
            if (dp[i] == 0) {
                dp[i] = i;
            }
        }
    }
    public static long Ptich(int n) {
        if (n == 1) return 1;
        long sum = 0;
        while (n != 1) {
            sum += dp[n];
            n /= dp[n];
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        sieve();
        int t = scanner.nextInt();
        long sum = 0;
        while (t-- > 0) {
            int n = scanner.nextInt();
            sum += Ptich(n);
        }
        System.out.println(sum);
    }
}