import java.util.*;
import java.io.*;

/**
 * Create on 05/10/2024 07:45 by jayce
 */

public class J07021 {
    public static String chuanHoa(String s) {
        String[] words = s.trim().toLowerCase().split("\\s+");
        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList(words));
        for (int i = 0; i < arrayList.size(); i++) {
            String word = arrayList.get(i);
            arrayList.set(i, word.substring(0, 1).toUpperCase() + word.substring(1));
        }
        return String.join(" ", arrayList);
    }
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("DATA.in"));
        ArrayList<String> arrayList = new ArrayList<>();
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine().trim();
            if (line.equals("END")) {
                break;
            }
            if (!line.isEmpty()) {
                arrayList.add(line);
            }
        }
        for (String word : arrayList) {
            System.out.println(chuanHoa(word));
        }
    }
}