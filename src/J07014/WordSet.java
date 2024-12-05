package J07014;


import java.util.*;
import java.io.*;

public class WordSet {
    private Set<String> set = new HashSet<>();

    public WordSet(String fileName) throws IOException {
        Scanner scanner = new Scanner(new File(fileName));
        Set<String> temp = new HashSet<>();
        while (scanner.hasNextLine()) {
            String[] words = scanner.nextLine().toLowerCase().split("\\s+");
            temp.addAll(Arrays.asList(words));
        }
        this.set = temp;
    }

    public String union(WordSet other) {
        Set<String> temp = new HashSet<>(other.set);
        temp.addAll(set);
        ArrayList<String> list = new ArrayList<>(temp);
        Collections.sort(list);
        return String.join(" ", list);
    }

    public String intersection(WordSet other) {
        Set<String> temp = new HashSet<>(other.set);
        temp.retainAll(set);
        ArrayList<String> list = new ArrayList<>(temp);
        Collections.sort(list);
        return String.join(" ", list).toLowerCase();
    }

}
