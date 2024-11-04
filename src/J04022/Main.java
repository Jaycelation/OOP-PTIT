package J04022;


import java.util.*;
import java.io.*;

/**
 * Create on 29/10/2024 18:05 by jayce
 */

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        WordSet s1 = new WordSet(in.nextLine());
        WordSet s2 = new WordSet(in.nextLine());
        System.out.println(s1.union(s2));
        System.out.println(s1.intersection(s2));
    }
}
