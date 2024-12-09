package test;


import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, FileNotFoundException, ClassNotFoundException {
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<Pair> list = (ArrayList<Pair>) objectInputStream.readObject();
        Collections.sort(list);
        HashSet<Pair> set = new HashSet<>();
        for (Pair p : list) {
            if (p.getFirst() < p.getSecond() && !set.contains(p.toString()) && gcd(p.getFirst(), p.getSecond()) == 1) {
                System.out.println(p);
            }
        }
    }
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
