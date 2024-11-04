package J05003;

import java.util.*;
import java.io.*;

/**
 * Create on 15/10/2024 16:11 by jayce
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
        for (Student student : list) {
            System.out.println(student);
        }
    }
}
/*
1
nGuyEn  vaN    biNH
D20CQCN01-B
2/12/2002
3.1
*/