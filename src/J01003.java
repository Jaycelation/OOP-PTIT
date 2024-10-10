import java.util.Scanner;

public class J01003 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if (a == 0) {
            if (b != 0) {
                System.out.println("VN");
            }
            else {
                System.out.println("VSN");
            }
        } else {
            double ans = (double)-b/a;
            System.out.printf("%.2f\n", ans);
        }

    }
}
