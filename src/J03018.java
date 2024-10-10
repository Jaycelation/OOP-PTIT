import java.util.Scanner;

/*
        S = 1^n + 2^n + 3^n + 4^n mod 5 =
        {
            1. S = 4 if n ≡ 0 mod 4
            2. S = 0 if n ≡ 1 mod 4
            3. S = 0 if n ≡ 2 mod 4
            4. S = 0 if n ≡ 3 mod 4
        }
*/

public class J03018 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();
        while (t-- > 0) {
            String nStr = scanner.next();
            int nMod4 = 0;
            for (char c : nStr.toCharArray()) {
                nMod4 = (nMod4 * 10 + (c - '0')) % 4; // Tính n % 4
            }
            int result;
            switch (nMod4 % 4) {
                case 0:
                    result = 4;
                    break;
                case 1:
                case 2:
                case 3:
                    result = 0;
                    break;
                default:
                    result = 0;
                    break;
            }

            System.out.println(result);
        }

    }
}
