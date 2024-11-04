import java.util.*;
import java.io.*;

/**
 * Create on 18/10/2024 20:46 by jayce
 */

public class J02037 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            String s = sc.nextLine();
            String[] numbers = s.split("\\s+");
            int count1 = 0, count2 = 0;
            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i].charAt(numbers[i].length() - 1) % 2 == 0) {
                    count1++;
                } else {
                    count2++;
                }
            }
            if ((numbers.length % 2 == 0 && count1 > count2) || (numbers.length % 2 != 0 && count2 > count1)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
