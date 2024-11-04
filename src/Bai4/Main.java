package Bai4;

import java.util.*;
import java.io.*;

/**
 * Create on 03/11/2024 12:31 by jayce
 */

public class Main {
    public static void main(String[] args) throws IOException, FileNotFoundException {
        Scanner sc = new Scanner(new File("LUYENTAP.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Student> list = new ArrayList<>();
        while (n-- > 0) {
            String name = sc.nextLine();
            String[] line = sc.nextLine().split("\\s+");
            int trueSubmit = Integer.parseInt(line[0]);
            int totalSubmit = Integer.parseInt(line[1]);
            Student s = new Student(name, trueSubmit, totalSubmit);
            list.add(s);
        }
        list.sort(Comparator.comparing(Student::getTrueSubmit).reversed().thenComparing(Student::getTotalSubmit).thenComparing(Student::getName));
        for (Student s : list) {
            System.out.println(s);
        }
    }
}
