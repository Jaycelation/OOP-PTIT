import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class J03020 {
    public static boolean check(String s) {
        StringBuilder temp = new StringBuilder(s);
        temp.reverse();
        return s.equals(temp.toString());
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max_len = -100000;

        HashMap<String, Integer> hashMap = new HashMap<>();
        ArrayList<String> arrayList = new ArrayList<>();

        while (scanner.hasNext()) {
            String s = scanner.next();
            if (check(s)) {
                max_len = Math.max(max_len, s.length());
                if (hashMap.containsKey(s)) {
                    hashMap.put(s, hashMap.get(s)+1);
                } else {
                    arrayList.add(s);
                    hashMap.put(s, 1);
                }
            }
        }

        for (String x : arrayList) {
            if (x.length() == max_len) {
                System.out.println(x + " " + hashMap.get(x));
            }
        }

    }
}