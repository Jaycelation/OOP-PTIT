
import java.util.*;
import java.io.*;

/**
 * Create on 01/10/2024 19:44 by jayce
 */

import java.io.*;
import java.util.*;

public class J07015 {
    public static boolean checkPrime(int n) {
        for (int i = 2; i <= Math.sqrt(n); ++i) {
            if (n % i == 0) {
                return false;
            }
        }
        return n > 1;
    }
    public static void main(String[] args) throws IOException, ClassNotFoundException{
        ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("SONGUYEN.in"));
        ArrayList<Integer> arrayList = (ArrayList<Integer>) inputStream.readObject();
        TreeMap<Integer, Integer> treeMap = new TreeMap<>();
        for (Integer i : arrayList) {
            if (checkPrime(i)) {
                treeMap.put(i, treeMap.getOrDefault(i,0) + 1);
            }
        }
        for (HashMap.Entry<Integer, Integer> entry : treeMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
