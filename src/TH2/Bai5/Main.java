package Bai5;

import java.util.*;
import java.io.*;

/**
 * Create on 03/11/2024 12:53 by jayce
 */

public class Main {
    public static void main(String[] args) throws IOException, FileNotFoundException {
        Scanner sc = new Scanner(new File("MONHOC.in"));
        ArrayList<Subject> list = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();
        while (sc.hasNextLine()) {
            String id = sc.nextLine();
            String name = sc.nextLine();
            String expression = sc.nextLine();
            map.put(id, map.getOrDefault(id, 0) + 1);
            if (map.get(id) == 1) {
                list.add(new Subject(id, name, expression));
            }
        }
        list.sort(Comparator.comparing(Subject::getId));
        for (Subject s : list) {
            System.out.println(s);
        }

    }
}
