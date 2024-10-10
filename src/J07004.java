import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
public class J07004 {
    public static void main(String[] args) throws FileNotFoundException{
        try {
            Scanner scanner = new Scanner(new File("src/DATA.in"));
            Map<Integer, Integer> map = new HashMap<>();

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] tokens = line.split("\\D+");
                for (String token : tokens) {
                    int number = Integer.parseInt(token);
                    map.put(number, map.getOrDefault(number, 0) + 1);
                }
            }

            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                System.out.println( entry.getKey() + " " + entry.getValue());
            }

        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }
    }
}
