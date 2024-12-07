package Contest;


import java.util.*;
import java.io.*;

public class Bai18 {
    public static void main(String[] args) throws IOException, FileNotFoundException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("DAYSO.DAT"));
        ArrayList<Integer> list = (ArrayList<Integer>) ois.readObject();

        Set<Integer> set  = new TreeSet<>();
        for (int i = 0; i < list.size(); i++) {
            if (checkPrime(list.get(i))) {
                set.add(list.get(i));
            }
        }
        for (Integer i : set) {
            System.out.println(i);
        }
    }
    public static boolean checkPrime(int n) {
        if (n < 100) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return n > 1;
    }
}
