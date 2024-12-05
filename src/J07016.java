import java.util.*;
import java.io.*;

public class J07016 {
    public static void main(String[] args) throws IOException, FileNotFoundException, ClassNotFoundException {
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ArrayList<Integer> list1 = (ArrayList<Integer>) objectInputStream.readObject();
        ObjectInputStream objectInputStream2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<Integer> list2 = (ArrayList<Integer>) objectInputStream2.readObject();
        Map<Integer, Integer> map1 = new HashMap<>();
        Map<Integer, Integer> map2 = new HashMap<>();
        for (Integer num : list1) {
            if (checkSNT(num)) {
                map1.put(num, map1.getOrDefault(num, 0) + 1);
            }
        }
        for (Integer num : list2) {
            if (checkSNT(num)) {
                map2.put(num, map2.getOrDefault(num, 0) + 1);
            }
        }

        Set<Integer> set = new TreeSet<>();
        set.addAll(map1.keySet());
        set.addAll(map2.keySet());

        for (Integer num : set) {
            System.out.println(num + " " + map1.getOrDefault(num, 0) + " " + map2.getOrDefault(num, 0));
        }

    }
    public static boolean checkSNT(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return n > 1;
    }
}
