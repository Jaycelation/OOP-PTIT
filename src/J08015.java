import java.util.HashMap;
import java.util.Scanner;

public class J08015 {
    public static long countPairs(long[] arr, int n, long k) {
        HashMap<Long, Integer> map = new HashMap<>();
        long count = 0;
        for (int i = 0; i < n; ++i) {
            long complement = k - arr[i];
            if (map.containsKey(complement)) {
                count += map.get(complement);
            }
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            long k = scanner.nextLong();
            long[] arr = new long[n];

            for (int i = 0; i < n; ++i) {
                arr[i] = scanner.nextLong();
            }
            System.out.println(countPairs(arr, n, k));
        }
    }
}
