import java.util.Scanner;

public class J03037 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        int[][] pos = new int[26][2];
        int[] count = new int[26];

        for (int i = 0; i < 52; i++) {
            int ch = s.charAt(i) - 'A';
            pos[ch][count[ch]++] = i;
        }

        int intersections = 0;

        for (int i = 0; i < 26; i++) {
            for (int j = i + 1; j < 26; j++) {
                int a1 = pos[i][0], a2 = pos[i][1];
                int b1 = pos[j][0], b2 = pos[j][1];

                if ((a1 < b1 && b1 < a2 && a2 < b2) || (b1 < a1 && a1 < b2 && b2 < a2)) {
                    intersections++;
                }
            }
        }

        System.out.println(intersections);
    }
}
