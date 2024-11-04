package Bai11;


import java.util.*;
import java.io.*;

/**
 * Create on 03/11/2024 15:28 by jayce
 */

public class Main {
    public static void main(String[] args) throws IOException , FileNotFoundException{
        Scanner sc = new Scanner(new File("DANHSACH.in"));
        ArrayList<Student> listS = new ArrayList();
        while (sc.hasNextLine()) {
            String id = sc.nextLine();
            String name = sc.nextLine();
            String classess = sc.nextLine();
            String gmail = sc.nextLine();
            String phone = sc.nextLine();
            if (phone.length() < 10) {
                phone = "0" + phone;
            }
            listS.add(new Student(id, name, classess, gmail, phone));
        }

        sc = new Scanner(new File("HUONGDAN.in"));
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            String[] line = sc.nextLine().split("\\s+");
            String name = "";
            for (int i = 0; i < line.length-1; i++) {
                name += line[i];
                if (i != line.length-1) {
                    name += " ";
                }
            }
            ArrayList<Project> listP = new ArrayList();
            int count = Integer.parseInt(line[line.length-1]);
            for (int i = 0; i < count; i++) {
                String[] line1 = sc.nextLine().split("\\s+");
                String idS = line1[0];
                String nameP = "";
                for (int j = 1; j < line1.length; ++j) {
                    nameP += line1[j];
                    if (j != line1.length-1) {
                        nameP += " ";
                    }
                }
                Student student = null;
                for (Student s : listS) {
                    if (s.getId().equals(idS)) {
                        student = s;
                        break;
                    }
                }
                listP.add(new Project(nameP, student));
            }
            listP.sort(Comparator.comparing(Project::idS));
            for (Project p : listP) {
                System.out.println(p);
            }

        }
    }
}
