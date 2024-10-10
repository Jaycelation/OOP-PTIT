package J05033;

import java.util.*;
import java.io.*;

/**
 * Create on 09/10/2024 13:24 by jayce
 */

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Time> list = new ArrayList<Time>();
        for (int i = 0; i < n; ++i) {
            list.add(new Time(sc.nextInt(), sc.nextInt(), sc.nextInt()));
        }
        Collections.sort(list, new SortTime());
        for (Time t : list) {
            System.out.println(t);
        }
    }
}
