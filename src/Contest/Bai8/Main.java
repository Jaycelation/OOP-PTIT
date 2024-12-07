package Contest.Bai8;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            int n = in.nextInt();
            Map<Integer, Integer> m = new LinkedHashMap<>();
            for (int i = 0; i < n; i++) {
                int x = in.nextInt();
                m.put(x, m.getOrDefault(x, 0) + 1);
            }

            List<Pair> ds = new ArrayList<>();
            int i = 0;
            for (Integer x : m.keySet()) {
                ds.add(new Pair(x, m.get(x), i++));
            }

            Collections.sort(ds);

            for (Pair x : ds) {
                int f = x.getF();
                int so = x.getN();
                while (f-- > 0) {
                    System.out.printf("%d ", so);
                }
            }
            System.out.println("");

        }
    }
}
