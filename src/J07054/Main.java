package J07054;

import java.util.*;
import java.io.*;

/**
 * Create on 03/11/2024 22:40 by jayce
 */

public class Main {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        Scanner sc = new Scanner(new File("BANGDIEM.in"));
        ArrayList<Student> listS = new ArrayList();
        int t = Integer.parseInt(sc.nextLine());
        int count = 1;
        while (t-- > 0) {
            String id = "SV" + String.format("%02d", count++);
            String[] line = sc.nextLine().trim().toLowerCase().split("\\s+");
            String name = "";
            for (int i = 0; i < line.length; i++) {
                name += line[i].substring(0, 1).toUpperCase() + line[i].substring(1);
                if (i < line.length - 1) {
                    name += " ";
                }
            }
            int d1 = Integer.parseInt(sc.nextLine());
            int d2 = Integer.parseInt(sc.nextLine());
            int d3 = Integer.parseInt(sc.nextLine());
            listS.add(new Student(id, name, d1, d2, d3));
        }
        listS.sort(Comparator.comparing(Student::getScore).reversed().thenComparing(Student::getId));

        listS.get(0).setRank(1);
        System.out.println(listS.get(0));
        for (int i = 1; i < listS.size(); i++) {
            if (listS.get(i).getScore() == listS.get(i - 1).getScore()) {
                listS.get(i).setRank(listS.get(i - 1).getRank());
            }
            else {
                listS.get(i).setRank(i + 1);
            }
            System.out.println(listS.get(i));
        }
    }
}
