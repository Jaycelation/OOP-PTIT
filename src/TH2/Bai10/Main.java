package Bai10;


import java.util.*;
import java.io.*;

/**
 * Create on 03/11/2024 13:07 by jayce
 */

public class Main {
    public static void main(String[] args) throws IOException , FileNotFoundException{
        Scanner sc = new Scanner(new File("DANHSACH.in"));
        ArrayList<Student> list = new ArrayList<>();

        while (sc.hasNext()) {
            String id = sc.nextLine();
            String name = sc.nextLine();
            String classes = sc.nextLine();
            String gmail = sc.nextLine();
            String phone = sc.nextLine();
            if (phone.length() != 10) {
                phone = "0" + phone;
            }
            list.add(new Student(id, name, classes, gmail, phone));
        }
        list.sort(Comparator.comparing(Student::getClasses).thenComparing(Student::getId));
        for (Student s : list) {
            System.out.print(s);
        }
    }
}
