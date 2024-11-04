package Bai3;


import java.util.*;
import java.io.*;

/**
 * Create on 03/11/2024 13:23 by jayce
 */

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [][] arr = new int[n][n];
        ArrayList<Pair> list = new ArrayList<>();
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j) {
                arr[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < n; ++i) {
            for (int j = i; j < n; ++j) {
               if (arr[i][j] == 1) {
                   list.add(new Pair(i+1, j+1));
               }
            }
        }

        for (Pair p : list) {
            System.out.println(p);
        }
    }
}
/*
6
0 1 1 0 1 0
1 0 1 0 1 0
1 1 0 1 0 0
0 0 1 0 1 1
1 1 0 1 0 1
0 0 0 1 1 0
 */