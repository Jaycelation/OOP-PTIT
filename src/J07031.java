import java.util.*;
import java.io.*;
import java.util.stream.Collectors;

public class J07031 {
    public static void main(String[] args) throws IOException, FileNotFoundException, ClassNotFoundException {
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ArrayList<Integer> list1 = (ArrayList<Integer>) objectInputStream.readObject();
        objectInputStream = new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<Integer> list2 = (ArrayList<Integer>) objectInputStream.readObject();

        boolean[] isPrime = sieve(1000000);
        Set<Integer> set1 = list1.stream().filter(n -> n <= 1000000 && isPrime[n]).collect(Collectors.toSet());
        Set<Integer> set2 = list2.stream().filter(n -> n <= 1000000 && isPrime[n]).collect(Collectors.toSet());

        set1.removeAll(set2);

        List<int[]> result = new ArrayList<>();
        for (int n : set1) {
            int m = 1_000_000 - n;
            if (m > n && set1.contains(m)) {
                result.add(new int[]{n, m});
            }
        }

        result.sort(Comparator.comparingInt(a -> a[0]));

        for (int[] pair : result) {
            System.out.println(pair[0] + " " + pair[1]);
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

    public static boolean[] sieve(int n) {
        boolean[] isPrime = new boolean[n + 1];
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false;
        for (int i = 2; i * i <= n; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= n; j += i) {
                    isPrime[j] = false;
                }
            }
        }
        return isPrime;
    }
}