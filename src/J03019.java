import java.util.Scanner;
import java.util.Stack;

public class J03019 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); ++i) {
            while (!stack.empty() && s.charAt(i) > stack.peek()) {
                stack.pop();
            }
            stack.push(s.charAt(i));
        }

        StringBuilder result = new StringBuilder();
        while (!stack.empty()) {
            result.insert(0, stack.pop());
        }
        System.out.println(result.toString());
    }
}
