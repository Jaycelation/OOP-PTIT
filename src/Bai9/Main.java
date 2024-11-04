package Bai9;


import java.util.*;
import java.io.*;

/**
 * Create on 03/11/2024 15:02 by jayce
 */

public class Main {
    public static void main(String[] args) throws IOException , FileNotFoundException{
        Scanner sc = new Scanner(new File("INSTITUTION.in"));
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<Truong> listT = new ArrayList<>();
        while (t-- > 0) {
            String[] line = sc.nextLine().split("\\s+");
            String id = line[0];
            String name = "";
            for (int i = 1; i < line.length; i++) {
                name += line[i];
                if (i < line.length - 1) {
                    name += " ";
                }
            }
            listT.add(new Truong(id, name));
        }

        sc = new Scanner(new File("REGISTER.in"));
        ArrayList<Register> listR = new ArrayList<>();
        t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            String[] line = sc.nextLine().split("\\s+");
            String idT = line[0];
            int count = Integer.parseInt(line[1]);
            for (int i = 1; i <= count; i++) {
                String name = sc.nextLine();
                Truong truong = null;
                for (Truong tr : listT) {
                    if (tr.getId().equals(idT)) {
                        truong = tr;
                        break;
                    }
                }
                listR.add(new Register(idT, name, truong));
            }
        }
        listR.sort(Comparator.comparing(Register::getT).thenComparing(Register::getName));
        int count = 1;
        for (Register r : listR) {
            System.out.println("team" + String.format("%02d", count) + " " + r);
            count++;
        }

    }
}
