import java.util.*;
import java.io.*;

public class J07007 {
    public static void main(String[] args)throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("src/VANBAN.in"));
        TreeSet<String> treeSet = new TreeSet<>();
        while (scanner.hasNextLine()) {
            String data =  scanner.nextLine();
            String[] token = data.split(" ");
            for (String i : token) {
                treeSet.add(i.toLowerCase(Locale.ROOT));
            }
        }
        for (String i : treeSet) {
            System.out.println(i);
        }
    }
}