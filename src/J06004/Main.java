package J06004;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().trim().split("\\s+");
        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);

        ArrayList<SinhVien> sinhViens = new ArrayList<>();

        for (int i = 0; i < n; ++i) {
            SinhVien sinhVien = new SinhVien(scanner.nextLine(), scanner.nextLine(), scanner.nextLine(), scanner.nextLine());
            sinhViens.add(sinhVien);
        }

        for (int i = 1; i <= m; ++i) {
            String project = scanner.nextLine();
            for (SinhVien j : sinhViens) {
                if (j.getGroupId().equals(i + "")) {
                    j.setProject(project);
                }
            }
        }

        Collections.sort(sinhViens, new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien o1, SinhVien o2) {
                return o1.getId().compareTo(o2.getId());
            }
        });

        for (SinhVien i : sinhViens) {
            System.out.println(i);
        }

    }
}