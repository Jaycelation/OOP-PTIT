package J04014;

import java.util.Scanner;

/**
 * Create on 15/10/2024 15:20 by Jayce
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            Fraction fractionA = new Fraction(sc.nextInt(), sc.nextInt());
            Fraction fractionB = new Fraction(sc.nextInt(), sc.nextInt());

            Fraction C = fractionA.sum(fractionB);
            C.pow();

            Fraction D = fractionA.multiply(fractionB.multiply(C));

            System.out.print(C);
            System.out.print(" ");
            System.out.println(D);
        }
    }
}
