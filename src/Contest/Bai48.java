package Contest;

import java.util.*;
import java.io.*;

public class Bai48 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream objectInputStream1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ArrayList<Integer> list1 = (ArrayList<Integer>) objectInputStream1.readObject();
        objectInputStream1.close();

        ObjectInputStream objectInputStream2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<Integer> list2 = (ArrayList<Integer>) objectInputStream2.readObject();
        objectInputStream2.close();

        Map<Integer, Integer> map1 = new HashMap<>();
        for (Integer i : list1) {
            map1.put(i, map1.getOrDefault(i, 0) + 1);
        }

        Map<Integer, Integer> map2 = new HashMap<>();
        for (Integer i : list2) {
            map2.put(i, map2.getOrDefault(i, 0) + 1);
        }

        TreeSet<Integer> resultSet = new TreeSet<>();
        for (Integer num : map1.keySet()) {
            if (map2.containsKey(num) && check(num)) {
                resultSet.add(num);
            }
        }

        for (Integer num : resultSet) {
            System.out.println(num + " " + map1.get(num) + " " + map2.get(num));
        }
    }
    private static boolean check(int num) {
        String temp = Integer.toString(num);
        if (temp.length() < 2) {
            return false;
        }
        for (int i = 0; i < temp.length() - 1; i++) {
            if (temp.charAt(i) > temp.charAt(i + 1)) {
                return false;
            }
        }
        return true;
    }
}