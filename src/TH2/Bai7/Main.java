package Bai7;


import java.util.*;
import java.io.*;

/**
 * Create on 03/11/2024 13:48 by jayce
 */

public class Main {
    public static void main(String[] args) throws IOException, FileNotFoundException {
        Scanner sc = new Scanner(new File("SINHVIEN.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Student> listS = new ArrayList<>();
        Map<String, String> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String id = sc.nextLine();
            String name = sc.nextLine();
            String classess = sc.nextLine();
            String gmail = sc.nextLine();
            String phone = sc.nextLine();
            String sex = sc.nextLine();
            listS.add(new Student(id, name, classess, gmail, phone, sex));
        }

        sc = new Scanner(new File("DANGKY.in"));
        while (sc.hasNextLine()) {
            String[] line = sc.nextLine().split("\\s+");
            String id = line[0];
            String size = line[1];
            map.put(id, size);
        }

        sc = new Scanner(new File("TRUYVAN.in"));
        int m = Integer.parseInt(sc.nextLine());
        while (m-- > 0) {
            String[] input = sc.nextLine().split("\\s+");
            String sex = input[0];
            String size = input[1];
            System.out.println("DANH SACH SINH VIEN " + sex.toUpperCase() + " DANG KY SIZE " + size);
            ArrayList<Student> students = new ArrayList<>();
            for (Student student : listS) {
                if (student.getSex().equals(sex) && map.containsKey(student.getId()) && map.get(student.getId()).equals(size)) {
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
