package Contest;


import java.util.*;
import java.io.*;

public class Bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        while (n-- > 0) {
            String[] s = sc.nextLine().split("\\s+");
            ArrayList<String> list = new ArrayList<>();
            for (int i = s.length - 1; i >= 0; i--) {
                list.add(s[i]);
            }
            for (int i = 0; i < list.size(); i++) {
                System.out.print(list.get(i) + " ");
            }
            System.out.println();
        }
    }
}
/*
2
I like this program very much
much very program this like I
 */
