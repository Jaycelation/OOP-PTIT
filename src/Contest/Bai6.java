package Contest;


import java.util.*;
import java.io.*;

public class Bai6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine().trim());
        while (n-- > 0) {
            int type = Integer.parseInt(sc.nextLine().trim());
            String ten = sc.nextLine().trim();
            String[] line = ten.trim().toLowerCase().split("\\s+");
            String temp = "";
            if (type == 1) {
                temp += line[line.length-1].substring(0, 1).toUpperCase() + line[line.length-1].substring(1) + " ";
                for (int i = 0; i < line.length-1; i++) {
                    temp += line[i].substring(0, 1).toUpperCase() + line[i].substring(1);
                    if (i != line.length-2) {
                        temp += " ";
                    }
                }
            } else if (type == 2) {
                for (int i = 1; i < line.length; i++) {
                    temp += line[i].substring(0, 1).toUpperCase() + line[i].substring(1);
                    if (i != line.length-1) {
                        temp += " ";
                    }
                }
                temp += " " + line[0].substring(0, 1).toUpperCase() + line[0].substring(1);
            }
            System.out.println(temp.trim());
        }
    }
}
/*
2
1
NguyeN    vAn    Nam
2
hoAng  le Nhat THONG chi
 */