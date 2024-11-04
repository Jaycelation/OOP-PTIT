package J99210;

import java.util.*;
import java.io.*;

/**
 * Create on 25/10/2024 21:38 by jayce
 */

public class Main {
    public static void main(String[] args) throws IOException, FileNotFoundException {
        Scanner sc = new Scanner(new File("src/J99210/SINHVIEN.in"));
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<Student> list = new ArrayList<>();
        Map<String, String> map = new HashMap<>();
        while (t-- > 0) {
            Student student = new Student(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            list.add(student);
        }

        sc = new Scanner(new File("src/J99210/DANGKY.in"));
        while (sc.hasNextLine()) {
            String[] line = sc.nextLine().split("\\s+");
            String id = line[0];
            String size = line[1];
            map.put(id, size);
        }

        sc = new Scanner(System.in);
        int test = Integer.parseInt(sc.nextLine());
        while (test-- > 0) {
            String[] input = sc.nextLine().split("\\s+");
            String sex = input[0];
            String size = input[1];
            System.out.println("DANH SACH SINH VIEN " + sex.toUpperCase() + " DANG KY SIZE " + size);
            ArrayList<Student> students = new ArrayList<>();
            for (Student student : list) {
                if (student.getSex().equals(sex) && map.containsKey(student.getId()) && map.get(student.getId()).equals(size)) {
                    System.out.println(map.get(student.getId()));
                    students.add(student);
                };
            }
            students.sort(Comparator.comparing(Student::getId));
            for (Student student : students) {
                System.out.println(student);
            }
        }
    }
}