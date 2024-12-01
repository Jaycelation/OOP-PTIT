import java.util.*;
import java.io.*;
import java.util.regex.Pattern;

public class J07011 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("VANBAN.in"));
        Map<String, Integer> map = new HashMap<>();
        int n = Integer.parseInt(sc.nextLine());
        while (n-- > 0) {
            String re = "[,\\.!?;:\\-()/]";
            String line = sc.nextLine().replaceAll(re, " ").toLowerCase();
            Pattern validWordPattern = Pattern.compile("^[a-zA-Z0-9]+$");
            String[] tokens = line.toLowerCase().split("\\s+");
            for (String token : tokens) {
                if (!token.isEmpty() && validWordPattern.matcher(token).matches()) {
                    map.put(token, map.getOrDefault(token, 0) + 1);
                }
            }
        }

        ArrayList<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort(Comparator.comparing(Map.Entry<String, Integer>::getValue, Comparator.reverseOrder()).thenComparing(Map.Entry::getKey));

        for (Map.Entry<String, Integer> entry : list) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

    }
}