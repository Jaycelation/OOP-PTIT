package Contest;


import java.util.*;
import java.io.*;

public class Bai17 {
    public static void main(String[] args) throws IOException, FileNotFoundException, ClassNotFoundException {
//        ObjectInputStream obs = new ObjectInputStream(new FileInputStream("DATA.in"));
//        ArrayList<String> list = (ArrayList<String>) obs.readObject();
         Scanner scanner = new Scanner(new File("src/Contest/DATA.in"));
         ArrayList<String> list = new ArrayList<>();
         while (scanner.hasNextLine()) {
             String[] line = scanner.nextLine().split("\\s+");
             for (int i = 0; i < line.length; i++) {
                 list.add(line[i]);
             }
         }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(convert(list.get(i)) + " " + convert2(convert(list.get(i))));
        }
    }
    public static String convert(String s) {
        String temp = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '0' || s.charAt(i) == '1') {
                temp += s.charAt(i);
            }
        }
        return temp;
    }
    public static long convert2(String s) {
        long val = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                val += Math.pow(2, i);
            }
        }
        return val;
    }

}