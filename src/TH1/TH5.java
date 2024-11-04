import java.util.*;
import java.io.*;

/**
 * Create on 06/10/2024 12:50 by jayce
 */

/*5. ĐỌC FILE NHỊ PHÂN - 1
 */

public class TH5 {
    public static boolean checkPrime(Integer n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return n > 2;
    }
    public static void main(String[] args) throws IOException, FileNotFoundException, ClassNotFoundException {
        ObjectInputStream obj = new ObjectInputStream(new FileInputStream("DAYSO.DAT"));
        ArrayList<Integer> arrayList = (ArrayList<Integer>) obj.readObject();
        TreeSet<Integer> treeSet = new TreeSet<>();
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i) > 100 && checkPrime(arrayList.get(i))) {
                treeSet.add(arrayList.get(i));
            }
        }
        for (Integer integer : treeSet) {
            System.out.println(integer);
        }
    }
}