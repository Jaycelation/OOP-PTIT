package TH2_2;

import java.util.*;
import java.io.*;

public class Bai1 {
    public static void main(String[] args) throws IOException, FileNotFoundException, ClassNotFoundException {
        ObjectInputStream obj = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<String> listObj = (ArrayList<String>) obj.readObject();
        TreeSet<Integer> list = new TreeSet<>();

        for (String line : listObj) {
            String[] words = line.split("\\s+");
            for (String word : words) {
                try {
                    int val = Integer.parseInt(word);
                    list.add(val);
                } catch (NumberFormatException e) {

                }
            }
        }

        for (int num : list) {
            System.out.println(num);
        }

    }
}
