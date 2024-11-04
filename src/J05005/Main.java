package J05005;

import java.util.*;
import java.io.*;

import static java.util.Collections.sort;

/**
 * Create on 25/10/2024 20:27 by jayce
 */

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> list = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 1; i <= n; ++i) {
            Student student = new Student("B20DCCN" + String.format("%03d", i), sc.nextLine(), sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine()));
            list.add(student);
        }
        list.sort(Comparator.comparingDouble(Student::getGpa).reversed());
        for (Student student : list) {
            System.out.println(student);
        }
    }
}