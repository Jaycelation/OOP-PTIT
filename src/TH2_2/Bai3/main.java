package TH2_2.Bai3;


import java.io.*;
import java.util.*;

/**
 * Create on 10/11/2024 07:51 by jayce
 */

public class main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DANHSACH.in"));

        ArrayList<Student> listS = new ArrayList<>();
        while (sc.hasNextLine()) {
            String id = sc.nextLine();
            String name = sc.nextLine();
            String classes = sc.nextLine();
            String email = sc.nextLine();
            String phone = sc.nextLine();
            listS.add(new Student(id, name, classes, email, phone));
        }
        listS.sort(Comparator.comparing(Student::getClasses).thenComparing(Student::getId));
        for (Student s : listS) {
            System.out.println(s);
        }
    }

}
