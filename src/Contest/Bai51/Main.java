package Contest.Bai51;


import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, FileNotFoundException {
        Scanner scanner = new Scanner(new File("INSTITUTION.in"));
        ArrayList<INSTITUTION> listI = new ArrayList();
        int n = Integer.parseInt(scanner.nextLine());

        while (n-- > 0) {
            String maT = scanner.next();
            String tenT = scanner.nextLine();
            listI.add(new INSTITUTION(maT, tenT));
        }
        scanner = new Scanner(new File("REGISTER.in"));
        n = Integer.parseInt(scanner.nextLine());
        ArrayList<REGISTER> listR = new ArrayList();
        while (n-- > 0) {
            String[] line = scanner.nextLine().split("\\s+");
            String maT = line[0];
            int soLuong = Integer.parseInt(line[1]);
            INSTITUTION institution = null;
            for (INSTITUTION i : listI) {
                if (i.getMaT().equals(maT)) {
                    institution = i;
                    break;
                }
            }
            for (int i = 0; i < soLuong; ++i) {
                String tenR = scanner.nextLine();
                listR.add(new REGISTER(tenR, institution));
            }
        }
        listR.sort(Comparator.comparing(REGISTER::getTenT).thenComparing(REGISTER::getTenR));
        int id = 1;
        for (REGISTER r : listR) {
            System.out.println("team" + String.format("%02d", id++) + " " + r);
        }
    }
}
