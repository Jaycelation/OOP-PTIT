package Contest;

import java.util.*;
import java.io.*;

public class Bai40 {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("DATA.in"));

        ArrayList<Integer> arr = (ArrayList<Integer>) ois.readObject();

        Map<Integer, Integer> map = new TreeMap<>();

        for (int x : arr) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
