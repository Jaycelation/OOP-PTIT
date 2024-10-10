import java.util.Scanner;
import java.util.Stack;
import java.util.Arrays;

public class JKT014 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int [] dp = new int[n];
            Arrays.fill(dp, 1);
            int [] a = new int[n];

            for (int i = 0; i < n; ++i) {
                a[i] = scanner.nextInt();
            }

            Stack<Integer> stack = new Stack<>();
            for (int i = 0; i < n; ++i) {
                while (!stack.empty() && a[i] >= a[stack.peek()]) {
                    dp[i] += dp[stack.peek()];
                    stack.pop();
                }
                stack.push(i);
            }
            for (int x : dp) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }
}
