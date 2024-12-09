import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class J07040 {
    public void main(String[] args) throws Exception {
        ObjectInputStream objectIn = new ObjectInputStream(new FileInputStream("NHIPHAN.in"));
        ArrayList<String> binaryList = (ArrayList<String>) objectIn.readObject();

        Set<String> set = new HashSet<>();
        for (String line : binaryList) {
            String[] words = line.toLowerCase().split("\\s+");
            set.addAll(Arrays.asList(words));
        }

        Scanner scanner = new Scanner(new File("VANBAN.in"));
        ArrayList<String> list = new ArrayList<>();
        while (scanner.hasNextLine()) {
            String[] words = scanner.nextLine().toLowerCase().split("\\s+");
            list.addAll(Arrays.asList(words));
        }

        LinkedHashSet<String> result = new LinkedHashSet<>();
        for (String word : list) {
            if (set.contains(word)) {
                result.add(word);
            }
        }

        for (String word : result) {
            System.out.println(word);
        }
    }
}
