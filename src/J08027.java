import java.util.LinkedList;
import java.util.Scanner;

public class J08027 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        LinkedList<Character> text = new LinkedList<>();
        int idx = 0;
        for (char op : s.toCharArray()) {
            switch (op) {
                case '-':
                    if (idx > 0) {
                        idx--;
                        text.remove(idx);
                    } break;
                case '<':
                    if (idx > 0) {
                        idx--;
                    } break;
                case '>':
                    if (idx < text.size()) {
                        idx++;
                    } break;
                default:
                    text.add(idx, op);
                    idx++;
                    break;
            }
        }
        StringBuilder result = new StringBuilder();
        for (char c : text) {
            result.append(c);
        }
        System.out.println(result);
    }
}
