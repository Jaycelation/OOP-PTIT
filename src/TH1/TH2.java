import java.util.*;
import java.io.*;

/**
 * Create on 06/10/2024 12:05 by jayce
 */

/*2. ĐÁNH DẤU SẢN PHẨM LỖI
Input 1
100 10
2 3 5 10 11 12 25 26 88 89
Output 1
Errors: 2-3, 5, 10-12, 25-26 and 88-89
Correct: 1, 4, 6-9, 13-24, 27-87 and 90-100
Input 2
40 18
1 3 4 6 7 8 9 12 13 14 20 25 26 27 28 30 38 40
Output 2
Errors: 1, 3-4, 6-9, 12-14, 20, 25-28, 30, 38 and 40
Correct: 2, 5, 10-11, 15-19, 21-24, 29, 31-37 and 39
 */
public class TH2 {
    public static String chuanHoa(List<Integer> list) {
        if (list.isEmpty()) return "";
        String result = "";
        int start = list.get(0);
        int end = start;
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) == end+1) {
                end = list.get(i);
            } else {
                if (start == end) {
                    result += start + ", ";
                } else {
                    result += start + "-" + end + ", ";
                }
                start = list.get(i);
                end = start;
            }
        }
        if (start == end) {
            result += start;
        } else {
            result += start + "-" + end;
        }
        int last = result.lastIndexOf(", ");
        if (last != -1) {
            result = result.substring(0, last) + " and" + result.substring(last + 1);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(), M = sc.nextInt();
        int[] arr = new int[M];
        List<Integer> list1 = new ArrayList<>();
        for (int i = 0; i < M; i++) {
            list1.add(sc.nextInt());
        }
        List<Integer> list2 = new ArrayList<>();
        for (int i = 1; i <= N; ++i) {
            if (!list1.contains(i)) {
                list2.add(i);
            }
        }
        System.out.println("Errors: " + chuanHoa(list1));
        System.out.println("Correct: " + chuanHoa(list2));
    }
}
