import java.util.*;
import java.io.*;
import java.util.regex.Pattern;

public class J07012 {
    public static void main(String[] args) throws IOException, FileNotFoundException, ClassNotFoundException {
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<String> list = (ArrayList<String>) objectInputStream.readObject();

        Map<String, Integer> map = new HashMap<>();
        for (String line : list) {
            String re = "[,\\.!?;:\\-()/]";
            line = line.replaceAll(re, " ").toLowerCase();
            Pattern validWord = Pattern.compile("^[a-zA-Z0-9]+$");
            String[] tokens = line.toLowerCase().split("\\s+");
            for (String token : tokens) {
                if (!token.isEmpty() && validWord.matcher(token).matches()) {
                    map.put(token, map.getOrDefault(token, 0) + 1);
                }
            }
        }

        ArrayList<Map.Entry<String, Integer>> lists = new ArrayList<>(map.entrySet());
        lists.sort(Comparator.comparing(Map.Entry<String, Integer>::getValue, Comparator.reverseOrder()).thenComparing(Map.Entry::getKey));

        for (Map.Entry<String, Integer> entry : lists) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

    }
}