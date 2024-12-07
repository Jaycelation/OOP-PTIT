package Contest;


import java.util.*;
import java.io.*;

public class Bai54 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int[] a = new int[n];
        int[] b = new int[m];

        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        for (int i = 0; i < m; i++) {
            b[i] = scanner.nextInt();
        }

        TreeSet<Integer> setA = new TreeSet<>();
        TreeSet<Integer> setB = new TreeSet<>();

        for (int num : a) {
            setA.add(num);
        }

        for (int num : b) {
            setB.add(num);
        }

        TreeSet<Integer> intersection = new TreeSet<>(setA);
        intersection.retainAll(setB);

        TreeSet<Integer> differenceA = new TreeSet<>(setA);
        differenceA.removeAll(setB);

        TreeSet<Integer> differenceB = new TreeSet<>(setB);
        differenceB.removeAll(setA);

        for (Integer i : intersection) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (Integer i : differenceA) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (Integer i : differenceB) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
