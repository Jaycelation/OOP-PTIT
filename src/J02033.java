import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class J02033 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        Arrays.sort(a);
        for (int i = 0; i < n && k > 0; i++) {
            if (a[i] < 0) {
                a[i] = -a[i];
                k--;
            } else {
                break;
            }
        }

        if (k > 0 && k % 2 == 1) {
            Arrays.sort(a);
            a[0] = -a[0];
        }
        long sum = 0;
        for (int value : a) {
            sum += value;
        }
        System.out.println(sum);
    }
}
