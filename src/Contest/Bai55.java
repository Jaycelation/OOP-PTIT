package Contest;


import java.util.*;
import java.io.*;

public class Bai55 {
    public static void main(String[] args) throws IOException, FileNotFoundException, ClassNotFoundException{
        ObjectInputStream objectInputStream1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ArrayList<String> list1 = (ArrayList<String>) objectInputStream1.readObject();

        Set<String> set1 = new TreeSet<>(list1);
        ObjectInputStream objectInputStream2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<Integer> list2 = (ArrayList<Integer>) objectInputStream2.readObject();

        Set<Integer> set2 = new TreeSet<>(list2);

        for (String s : set1) {
            for (Integer i : set2) {
                System.out.println(s+i);
            }
        }

    }
}
