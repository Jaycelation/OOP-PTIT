import java.util.*;

public class J08022 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] a = new int[n];
            int[] dp = new int[n];
            for (int i = 0; i < n; ++i) {
                a[i] = scanner.nextInt();
            }
            Stack<Integer> stack = new Stack<>();
            for (int i = n-1; i >= 0; i--) {
                while (!stack.empty() && a[i] >= stack.peek()) {
                    stack.pop();
                }
                if (stack.empty()) {
                    dp[i] = -1;
                }
                else {
                    dp[i] = stack.peek();
                }
                stack.push(a[i]);
            }
            for (int x : dp) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }
}
