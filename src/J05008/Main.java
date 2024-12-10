package J05008;


import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        while (n-- > 0) {
            int dinh = sc.nextInt();
            ArrayList<Point> list = new ArrayList<>();
            Point p = null;
            for (int i = 0; i < dinh; i++) {
                list.add(new Point(sc.nextInt(), sc.nextInt()));
            }
            p = list.get(0);
            list.add(list.get(0));
            double val1 = 0, val2 = 0;
            int i = 0, j = 1;
            while (i < list.size()-1) {
                Point p1 = list.get(i);
                Point p2 = list.get(j);
                val1 += p1.getX() * p2.getY();
                i++;
                j++;
            }
            i = 0;
            j = 1;
            while (i < list.size()-1) {
                Point p1 = list.get(i);
                Point p2 = list.get(j);
                val2 += p1.getY() * p2.getX();
                i++;
                j++;
            }
            System.out.println(String.format("%.3f", (val1 - val2)/2));
        }
    }
}
/*
3
5
-3 -2
-1 4
6 1
3 10
-4 9
3
0 0
1 0
0 1
4
0 0
2 0
2 2
0 2
 */