import java.util.*;
import java.io.*;
import java.util.stream.Collectors;

public class J07030 {
    public static void main(String[] args) throws IOException, FileNotFoundException, ClassNotFoundException {
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ArrayList<Integer> list1 = (ArrayList<Integer>) objectInputStream.readObject();
        objectInputStream = new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<Integer> list2 = (ArrayList<Integer>) objectInputStream.readObject();

        Set<Integer> set1 = list1.stream().filter(J07030::checkPrime).collect(Collectors.toSet());
        Set<Integer> set2 = list2.stream().filter(J07030::checkPrime).collect(Collectors.toSet());

        ArrayList<int[]> result = new ArrayList<>();
        for (Integer n : set1) {
            int m = 1000000 - n;
            if (m > n && set2.contains(m)) {
                result.add(new int[]{n, m});
            }
        }

        result.sort(Comparator.comparing(a -> a[0]));
        for (int[] a : result) {
            System.out.println(a[0] + " " + a[1]);
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
