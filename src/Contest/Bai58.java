package Contest;


import java.util.*;
import java.io.*;

public class Bai58 {
    public static void main(String[] args) throws IOException, FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
        long res = 0;
        while (sc.hasNextLine()) {
            String[] line = sc.nextLine().split("\\s+");
            for (int i = 0; i < line.length; i++) {
                try {
                    long val = Long.parseLong(line[i]);
                    if (val <= Long.MAX_VALUE && val > Integer.MAX_VALUE) {
                        res += val;
                    }
                } catch (NumberFormatException e) {

                }

            }
        }
        System.out.println(res);
    }
}
