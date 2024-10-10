import java.util.*;

public class J08012 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int result = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n-1; ++i) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            map.put(x, map.getOrDefault(x, 0)+1);
            map.put(y, map.getOrDefault(y, 0)+1);
            result = Math.max(map.getOrDefault(x, 0), map.getOrDefault(y, 0));
        }
        if (result == n-1) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
}
