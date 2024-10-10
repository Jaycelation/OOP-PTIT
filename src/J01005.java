import java.util.*;
import java.io.*;

public class J01005 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int h = scanner.nextInt();

            double S = (double) h/2;
            System.out.println(h*Math.sqrt((double) 1/n));

        }
    }
}
