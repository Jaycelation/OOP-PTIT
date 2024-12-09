import java.util.*;
import java.io.*;

public class J07078 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("src/STRING.in"));

        int n = Integer.parseInt(sc.nextLine());
        while (n-- > 0) {
            String s = sc.nextLine();
            String w = sc.nextLine();
            for (int i = 0; i <= s.length()-w.length(); i++) {
                if (s.substring(i, i+w.length()).equals(w)) {
                    System.out.print(i+1 + " ");
                }
            }
            System.out.println();
        }

    }
}
