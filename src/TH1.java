import java.util.*;
import java.io.*;

/**
 * Create on 06/10/2024 12:00 by jayce
 */

/*1. TÍNH ĐIỂM TRUNG BÌNH
Input
6
6.75 8 9.2 7.25 7.75 6.75
Output
7.67
* */
public class TH1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[] arr = new double[n];
        double max = -1, min = 11;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextDouble();
            max = Math.max(arr[i], max);
            min = Math.min(arr[i], min);
        }
        double total = 0;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] != max && arr[i] != min) {
                total += arr[i];
                count++;
            }
        }
        total /= count;
        System.out.printf("%.2f", total);
    }
}