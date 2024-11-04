package J05020;


import java.util.*;
import java.io.*;

/**
 * Create on 25/10/2024 20:37 by jayce
 */

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Student> list = new ArrayList<>();
        while (n-- > 0) {
            Student student = new Student(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            list.add(student);
        }
        list.sort(Comparator.comparing(Student::getClasses).thenComparing(Student::getId));
        for (Student student : list) {
            System.out.println(student);
        }
    }
}
