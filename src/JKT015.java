import java.util.Scanner;
import java.util.LinkedList;

public class JKT015 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.next();
        LinkedList<Character> text = new LinkedList<>();
        int idx = 0;
        for (char op : str.toCharArray()) {
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
