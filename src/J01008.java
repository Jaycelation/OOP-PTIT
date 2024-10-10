import java.util.*;
import java.io.*;

public class J01008 {
    public static void phanTich(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                int cnt = 0;
                while (n % i == 0) {
                    n /= i;
                    cnt++;
                }
                System.out.print(i + "(" + cnt + ")");
                if (n != 1) System.out.print(" ");
            }
        }
        if (n != 1) {
            System.out.print(n + "(1)");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 1; i <= t; ++i) {
            int n = scanner.nextInt();
            System.out.print("Test " + i + ": ");
            phanTich(n);
        }
    }
}