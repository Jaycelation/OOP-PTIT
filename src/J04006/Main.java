package J04006;

import java.util.*;

public class Main {
    public static String chuanHoa(String dob) {
        if (dob.charAt(1) == '/') {
            dob = "0" + dob;
        }
        if (dob.charAt(4) == '/') {
            dob = dob.substring(0, 3) + "0" + dob.substring(3);
        }
        return dob;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String id = "B20DCCN001";
        String name = scanner.nextLine();
        String group = scanner.nextLine();
        String dob = scanner.nextLine();
        dob = chuanHoa(dob);
        double gpa = scanner.nextDouble();
        scanner.nextLine();

        SinhVien sinhVien = new SinhVien(id, name, group, dob, gpa);

        System.out.printf("%s %s %s %s %.2f", sinhVien.getId(), sinhVien.getName(), sinhVien.getGroup(), sinhVien.getDob(), sinhVien.getGpa());

    }
}
