import java.util.Scanner;
import java.util.Stack;

public class J08021 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            String s = scanner.next();
            int res = 0;
            Stack<Integer> stack = new Stack<>();
            stack.push(-1);
            for (int i = 0; i < s.length(); ++i) {
                char c = s.charAt(i);
                if (c == '(') {
                    stack.push(i);
                }
                else {
                    int top = stack.pop();
                    if (stack.size() > 0) {
                        res = Math.max(res, i - stack.peek());
                    }
                    if (stack.size() == 0) {
                        stack.push(i);
                    }
                }
            }
            System.out.println(res);
        }
    }
}
