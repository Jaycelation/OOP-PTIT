import java.util.Scanner;
import java.util.Stack;

public class J08020 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            String s = scanner.next();
            Stack<Character> stack = new Stack<>();
            boolean balanced = true;

            for (int i = 0; i < s.length(); ++i) {
                char c = s.charAt(i);

                if (c == '(' || c == '[' || c == '{') {
                    stack.push(c);
                }
                else if (c == ']' || c == ')' || c == '}') {
                    if (stack.isEmpty()) {
                        balanced = false;
                        break;
                    }
                    char top = stack.pop();
                    if ((c == ']' && top != '[') || (c == '}' && top != '{') || (c == ')' && top != '(')) {
                        balanced = false;
                        break;
                    }
                }
            }

            if (!stack.isEmpty()) {
                balanced = false;
            }

            System.out.println(balanced ? "YES" : "NO");
        }
        scanner.close();
    }
}
