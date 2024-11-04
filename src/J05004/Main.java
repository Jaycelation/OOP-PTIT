package J05004;

import java.util.*;
import java.io.*;

/**
 * Create on 25/10/2024 20:19 by jayce
 */

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<J05004.Student> list = new ArrayList<>();
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
