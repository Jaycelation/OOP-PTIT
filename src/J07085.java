import java.math.BigInteger;
import java.util.*;
import java.io.*;

public class J07085 {
    public static void main(String[] args) throws IOException, FileNotFoundException, ClassNotFoundException {
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<String> list = (ArrayList<String>) objectInputStream.readObject();
//        Scanner scanner = new Scanner(new File("src/DATA.in"));
//        ArrayList<String> list = new ArrayList<>();
//        while (scanner.hasNextLine()) {
//            list.add(scanner.nextLine());
//        }
        for (String i : list) {
            String temp = "";
            int val = 0;
            for (int j = 0; j < i.length(); j++) {
                if ((i.charAt(j)-'0' >= 0) && (i.charAt(j)-'0' <= 9)) {
                    temp += i.charAt(j);
                    val += (int)(i.charAt(j)-'0');
                }
            }
            BigInteger big = new BigInteger(temp);
            System.out.println(big.toString() + " " + val);
        }

    }
}
