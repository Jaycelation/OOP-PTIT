import java.util.*;
import java.io.*;

/**
 * Create on 03/11/2024 22:15 by jayce
 */

public class J07029 {
    public static boolean check(Integer n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return n > 1;
    }
    public static void main(String[] args) throws IOException, FileNotFoundException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<Integer> list = (ArrayList<Integer>) ois.readObject();
        Map<Integer, Integer> map = new HashMap<>();
        for (int number : list) {
            if (check(number)) {
                map.put(number, map.getOrDefault(number, 0) + 1);
            }
        }
        List<Map.Entry<Integer, Integer>> primeList = new ArrayList<>(map.entrySet());
        primeList.sort((a, b) -> b.getKey().compareTo(a.getKey()));
        int count = 0;
        for (Map.Entry<Integer, Integer> entry : primeList) {
            System.out.println(entry.getKey() + " " + entry.getValue());
            count++;
            if (count == 10) break;
        }
    }
}
