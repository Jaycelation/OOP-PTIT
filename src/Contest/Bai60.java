package Contest;


import java.util.*;
import java.io.*;

public class Bai60 {
    public static void main(String[] args) throws IOException, FileNotFoundException, ClassNotFoundException{
        ObjectInputStream objectInputStream1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ArrayList<Integer> list1 = (ArrayList<Integer>) objectInputStream1.readObject();

        ObjectInputStream objectInputStream2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<Integer> list2 = (ArrayList<Integer>) objectInputStream2.readObject();

        Map<Integer, Integer> map1 = new HashMap<>();
        for (Integer num : list1) {
            map1.put(num, map1.getOrDefault(num, 0) + 1);
        }


        Map<Integer, Integer> map2 = new HashMap<>();
        for (Integer num : list2) {
            map2.put(num, map2.getOrDefault(num, 0) + 1);
        }

        Set<Integer> set = new TreeSet<>();
        for (Integer num : map1.keySet()) {
            if (map2.containsKey(num) && checkPrime(num)) {
                set.add(num);
            }
        }

        for (Integer num : set) {
            System.out.println(num + " " + map1.get(num) + " " + map2.get(num));
        }
    }
    public static boolean checkPrime(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return n > 1;
    }
}
