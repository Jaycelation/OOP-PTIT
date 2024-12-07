package Contest.Bai29;


import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(in.readLine());
        StringBuilder result = new StringBuilder();

        for (int i = 1; i <= n; i++) {
            String[] line = in.readLine().split("\\s+");
            for (int j = i + 1; j <= n; j++) {
                if (line[j - 1].equals("1")) {
                    result.append("(").append(i).append(",").append(j).append(")\n");
                }
            }
        }

        System.out.print(result);
    }
}
