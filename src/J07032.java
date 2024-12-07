import java.util.*;
import java.io.*;

public class J07032 {
    public static void main(String[] args) throws IOException, FileNotFoundException, ClassNotFoundException {
        ObjectInputStream objectInputStream1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ObjectInputStream objectInputStream2 = new ObjectInputStream(new FileInputStream("DATA2.in"));

        ArrayList<Integer> list1 = (ArrayList<Integer>) objectInputStream1.readObject();
        ArrayList<Integer> list2 = (ArrayList<Integer>) objectInputStream2.readObject();

        Map<Integer, Integer> map1 = new HashMap<>();
        for (Integer i : list1) {
            map1.put(i, map1.getOrDefault(i, 0) + 1);
        }
        Map<Integer, Integer> map2 = new HashMap<>();
        for (Integer i : list2) {
            map2.put(i, map2.getOrDefault(i, 0) + 1);
        }

        Set<Integer> set = new TreeSet<>();
        for (Integer i : map1.keySet()) {
            if (map2.containsKey(i) && check(i)) {
                set.add(i);
            }
        }
        int count = 0;
        for (Integer i : set) {
            int val = map1.getOrDefault(i, 0) + map2.getOrDefault(i, 0);
            System.out.println(i + " " + val);
            count++;
            if (count == 10) break;
        }
    }

    public static boolean check(int n) {
        String temp = String.valueOf(n);
        if (temp.length() <= 1 || temp.length() % 2 == 0) {
            return false;
        }
        int i = 0, j = temp.length() - 1;
        while (i <= j) {
            int digit1 = temp.charAt(i) - '0';
            int digit2 = temp.charAt(j) - '0';
            if (digit1 != digit2 || digit1 % 2 == 0 || digit2 % 2 == 0) {
                return false;
            }
            i++; j--;
        }
        return true;
    }

}
