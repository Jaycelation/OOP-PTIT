package Contest;


import java.util.*;
import java.io.*;

public class Bai39 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("DATA.in"));

        long res = 0;
        while (sc.hasNext()) {
            String[] line = sc.nextLine().split("\\s+");
            for (int i = 0; i < line.length; i++) {
                try {
                    int val = Integer.parseInt(line[i]);
                    res += val;
                } catch (NumberFormatException e) {

                }
            }
        }
        System.out.println(res);

    }
}
