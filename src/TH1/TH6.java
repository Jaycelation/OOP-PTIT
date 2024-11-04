import java.util.*;
import java.io.*;

/**
 * Create on 06/10/2024 12:56 by jayce
 */

/*6. THIẾT LẬP ĐỊA CHỈ EMAIL - 2
Input
DANHSACH.in
    nGUYEn    quaNG   vInH
   tRan   thi THU    huOnG
   nGO   quoC  VINH
 lE            tuAn    aNH
NGO QUOC VINH
Tran THI THU huong
Output
vinhnq@ptit.edu.vn
huongttt@ptit.edu.vn
vinhnq2@ptit.edu.vn
anhlt@ptit.edu.vn
 */

public class TH6 {
    public static String chuanHoa1(String s) {
        String[] words = s.trim().toLowerCase().split("\\s+");
        String res = "";
        for (int i = 0; i < words.length-1; i++) {
            res += words[i] + " ";
        }
        res += words[words.length-1];
        return res;
    }
    public static String chuanHoa2(String s) {
        String[] words = s.trim().toLowerCase().split("\\s+");
        String res = "";
        res += words[words.length-1];
        for (int i = 0; i < words.length-1; i++) {
            res += words[i].charAt(0);
        }
        return res;
    }
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DANHSACH.in"));
        LinkedHashSet<String> set = new LinkedHashSet<>();
        Map<String, Integer> map = new LinkedHashMap<>();
        while (sc.hasNextLine()) {
            String line = sc.nextLine().trim();
            set.add(chuanHoa1(line));
        }
        for (String x : set) {
            String ans = chuanHoa2(x);
            if (map.containsKey(ans)) {
                map.put(ans, map.get(ans) + 1);
                System.out.println(ans + map.get(ans) + "@ptit.edu.vn");
            } else {
                map.put(ans, 1);
                System.out.println(ans + "@ptit.edu.vn");
            }
        }
    }
}