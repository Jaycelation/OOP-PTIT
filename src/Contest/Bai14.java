package Contest;


import java.util.*;
import java.io.*;

public class Bai14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[] arr = new double[n];
        double min = Double.MAX_VALUE, max = Double.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextDouble();
            min = Math.min(arr[i], min);
            max = Math.max(arr[i], max);
        }
        double val = 0;
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] != min && arr[i] != max) {
                val += arr[i];
                cnt++;
            }
        }

        System.out.println(String.format("%.2f", val/cnt));

    }
}
