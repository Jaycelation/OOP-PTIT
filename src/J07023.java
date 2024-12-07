import java.util.*;
import java.io.*;

public class J07023 {
    public static void main(String[] args) throws IOException, ClassNotFoundException, FileNotFoundException {
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ObjectInputStream objectInputStream2 = new ObjectInputStream(new FileInputStream("DATA2.in"));

        ArrayList<Integer> list1 = (ArrayList<Integer>) objectInputStream.readObject();
        ArrayList<Integer> list2 = (ArrayList<Integer>) objectInputStream2.readObject();
        HashMap<Integer, Integer> map1 = new HashMap<>();
        HashMap<Integer, Integer> map2 = new HashMap<>();
        for (int i = 0; i < list1.size(); i++) {
            map1.put(list1.get(i), map1.getOrDefault(list1.get(i), 0) + 1);
        }
        for (int i = 0; i < list2.size(); i++) {
            map2.put(list2.get(i), map2.getOrDefault(list2.get(i), 0) + 1);
        }
        TreeSet<Integer> set = new TreeSet<>();
        for (Integer i : list1) {
            if (map2.containsKey(i) && check(i)) {
                set.add(i);
            }
        }

        for (Integer i : set) {
            System.out.println(i + " " + map1.get(i) + " " + map2.get(i));
        }

    }

    public static boolean check(int n) {
        String temp = Integer.toString(n);
        int i = 0, j = temp.length() - 1;
        while (i < j) {
            if (temp.charAt(i) != temp.charAt(j)) {
                return false;
            }
            i++; j--;
        }
        return checkPrime(n);
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
