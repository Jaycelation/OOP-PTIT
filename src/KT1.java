import java.util.*;
import java.io.*;

public class KT1 {
    public static void main(String[] args) throws IOException, FileNotFoundException, ClassNotFoundException {
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<String> list = (ArrayList<String>) objectInputStream.readObject();
        TreeSet<Integer> set = new TreeSet<>();

        for (String line : list) {
            String[] token = line.split("\\s+");
            for (String temp : token) {
                try {
                    int number = Integer.parseInt(temp);
                    set.add(number);
                } catch (NumberFormatException e) {

                }
            }
        }
        for (int num : set) {
            System.out.println(num);
        }

    }
}
