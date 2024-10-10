import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
public class J07001 {
    public static void main(String[] args) throws FileNotFoundException {
        try {
            File file = new File("src/DATA.in");
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }
    }
}
