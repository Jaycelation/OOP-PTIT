package Contest;


import java.util.*;
import java.io.*;

public class Bai56 {
    public static void main(String[] args) throws IOException, FileNotFoundException, ClassNotFoundException {
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<String> list = (ArrayList<String>) objectInputStream.readObject();

        Set<Integer> set = new TreeSet<>();

        for (int i = 0; i < list.size(); i++) {
            String[] words = list.get(i).split("\\s+");
            for (int j = 0; j < words.length; j++) {
                try {
                    set.add(Integer.parseInt(words[j]));
                } catch (NumberFormatException e) {

                }
            }
        }
        for (Integer val : set) {
            System.out.println(val);
        }

    }
}
