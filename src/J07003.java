import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.math.BigInteger;
public class J07003 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("src/DATA.in"));

        String s = scanner.nextLine();
        while (s.length() != 1) {
            int len = s.length()/2;
            String s1 = s.substring(0, len);
            String s2 = s.substring(len, s.length());
            BigInteger big1 = new BigInteger(s1);
            BigInteger big2 = new BigInteger(s2);
            String sum = big1.add(big2).toString();
            s = sum;
            System.out.println(s);
        }
    }
}
