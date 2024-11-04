package J05018;


import java.util.*;

/**
 * Create on 25/10/2024 20:56 by jayce
 */

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<Student> list = new ArrayList<>();
        for (int i = 1; i <= t; i++) {
            String id = "HS" + String.format("%02d", i);
            String name = sc.nextLine();
            Double total = 0.0;
            for (int j = 0; j < 10; ++j) {
                Double val = sc.nextDouble();
                total += val;
                if (j == 0 || j == 1) {
                    total += val;
                }
            }
            total = total / 12;
            Student student = new Student(name, id, total);
            list.add(student);
            sc.nextLine();
        }
        list.sort(Comparator.comparing(Student::getTotal).reversed());
        for (Student student : list) {
            System.out.println(student);
        }
    }
}
/*
3
Luu Thuy Nhi
9.3  9.0  7.1  6.5  6.2  6.0  8.2  6.7  4.8  5.5
Le Van Tam
8.0  8.0  5.5  9.0  6.8  9.0  7.2  8.3  7.2  6.8
Nguyen Thai Binh
9.0  6.4  6.0  7.5  6.7  5.5  5.0  6.0  6.0  6.0
 */
