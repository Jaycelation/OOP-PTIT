import java.util.*;
import java.io.*;

/**
 * Create on 06/10/2024 14:34 by jayce
 */

/*14. KIỂM TRA CÂU VIẾT ĐÚNG QUY TẮC
Input
3
[ graph ] ( binary tree ).
Dynamic programming )( devide and conquer.
([ (([( [ ] ) ( ) (( ))] )) ]).
Output
YES
NO
YES
 */

public class TH14 {
    public static boolean check(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[') {
                stack.push(c);
            } else if (c == ')') {
                if (stack.isEmpty() || stack.pop() != '(') {
                    return false;
                }
            } else if (c == ']') {
                if (stack.isEmpty() || stack.pop() != '[') {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String s = sc.nextLine();
            String temp = "";
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (c == '(' || c == '[' || c == ']' || c == ')') {
                    temp += c;
                }
            }
            if (check(temp)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}