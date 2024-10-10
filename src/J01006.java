import java.util.*;
import java.io.*;

public class J01006 {
    public static long[] Fibonacci = new long[94];

    public static void init() {
        Fibonacci[0] = 0;
        Fibonacci[1] = 1;
        Fibonacci[2] = 1;
        for (int i = 3; i <= 93; ++i) {
            Fibonacci[i] = Fibonacci[i-1] + Fibonacci[i-2];
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            init();
            int n = scanner.nextInt();
            System.out.println(Fibonacci[n]);
        }
    }
}
