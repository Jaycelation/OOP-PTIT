import java.util.Scanner;

public class J01011 {
    public static long _gcd(long a, long b) {
        while (b != 0) {
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    public static long _lcm(long a, long b) {
        return a * (b / _gcd(a, b));
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            long a = scanner.nextLong();
            long b = scanner.nextLong();
            System.out.println(_lcm(a, b) + " " + _gcd(a, b));
        }
    }
}
