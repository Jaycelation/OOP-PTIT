import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
public class J07002 {
    public static void main(String[] args) throws FileNotFoundException {
        try {
            File file = new File("src/DATA.in");
            Scanner scanner = new Scanner(file);

            long totalSum = 0;

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] tokens = line.split("\\D+");

                for (String token : tokens) {
                    if (!token.isEmpty()) {
                        try {
                            int number = Integer.parseInt(token);
                            totalSum += number;
                        } catch (NumberFormatException e) {
                        }
                    }
                }
            }
            System.out.println(totalSum);

            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }
    }
}
