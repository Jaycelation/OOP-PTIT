import java.util.*;

public class J01001 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[2];
        int check = 1;
        for (int i = 0; i < 2; ++i) {
            arr[i] = scanner.nextInt();
            if (arr[i] <= 0) {
                check = -1;
            }
        }
        if (check == -1) {
            System.out.println(0);
        }
        else {
            System.out.println((arr[0]+arr[1])*2 + " " + arr[0]*arr[1]);
        }
    }
}
