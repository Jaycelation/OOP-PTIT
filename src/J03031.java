import java.util.HashMap;
import java.util.Scanner;

public class J03031 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();
        while (t-- > 0) {
            HashMap<Character, Boolean> hashMap = new HashMap<>();
            String s = scanner.next();
            int k = scanner.nextInt();
            for (int i = 0; i < s.length(); ++i) {
                hashMap.put(s.charAt(i), true);
            }
            if (hashMap.size() == 26) {
                System.out.println("YES");
            } else {
                int temp = 26 - hashMap.size();
                if (k >= temp) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        }


    }
}
