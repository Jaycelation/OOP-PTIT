import java.io.*;
import java.util.*;

/**
 * Create on 06/10/2024 12:18 by jayce
 */

/*4. GIÁ TRỊ NHỊ PHÂN
Input
DATA.in
5678321010286421
9999999000000000000000000
Output
10101 21
000000000000000000 0
 */

public class TH4 {
    public static void main(String[] args) throws IOException, FileNotFoundException, ClassNotFoundException{
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<String> arrayList = (ArrayList<String>) ois.readObject();
        for (int i = 0; i < arrayList.size(); i++) {
            String tmp = "";
            for (int j = 0; j < arrayList.get(i).length(); j++) {
                if (arrayList.get(i).charAt(j) == '0' || arrayList.get(i).charAt(j) == '1') {
                    tmp += arrayList.get(i).charAt(j);
                }
            }
            if (tmp != "") {
                long result = 0;
                for (int j = 0; j < tmp.length(); j++) {
                    result += (long) (Math.pow(2, tmp.length()-j-1) * (tmp.charAt(j)-'0'));
                }
                System.out.println(tmp + " " + result);
            }
        }
    }
}