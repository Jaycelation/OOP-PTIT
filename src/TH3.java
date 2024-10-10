import java.util.*;
import java.io.*;

/**
 * Create on 06/10/2024 12:09 by jayce
 */

/*3. TÍNH TỔNG SỐ LONG
Input
DATA.in
12 3 4 5 6 7
123243434354546
Aaa 1 1 Bbb XXX yyy 5 5 dsfrgrt3
45646szdfse545
44444444444444
999999999999999999999999999
9876543456
9
Output
167697755342446
 */

public class TH3 {
    public static boolean check(String s) {
        long number;
        try {
            number = Long.parseLong(s);
        } catch (NumberFormatException e) {
            return false;
        }
        return number > Integer.MAX_VALUE && number <= Long.MAX_VALUE;
    }
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc = new Scanner(new File("DATA.in"));
        ArrayList<String> arrayList = new ArrayList<>();
        while (sc.hasNext()){
            String line = sc.nextLine();
            String[] words = line.trim().split("\\s+");
            for (int i = 0; i < words.length; i++) {
                arrayList.add(words[i]);
            }
        }
        long sum = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            if (check(arrayList.get(i))) {
                sum += Long.parseLong(arrayList.get(i));
            }
        }
        System.out.println(sum);
    }
}