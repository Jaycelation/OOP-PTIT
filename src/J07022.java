import java.util.*;
import java.io.*;

/**
 * Create on 06/10/2024 11:30 by jayce
 */

public class J07022 {
    public static boolean isInteger(String s) {
        try {
            Integer.parseInt(s);
            return true;
        }
        catch (NumberFormatException e) {
            return false;
        }
    }
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
        ArrayList<String> arrayList = new ArrayList<>();
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            String[] words = line.trim().split("\\s+");
            for (int i = 0; i < words.length; i++) {
                if (!isInteger(words[i])) {
                    arrayList.add(words[i]);
                }
            }
        }
        arrayList.sort(String::compareTo);
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.print(arrayList.get(i) + " ");
        }
    }
}
