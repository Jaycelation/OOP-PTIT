package J04005;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        String dob = scanner.nextLine();
        double point1 = scanner.nextDouble();
        double point2 = scanner.nextDouble();
        double point3 = scanner.nextDouble();

        ThiSinh thiSinh = new ThiSinh(name, dob, point1, point2, point3);
        System.out.printf("%s %s %.1f\n", thiSinh.getName(), thiSinh.getDob(), thiSinh.getTotal());
    }
}
