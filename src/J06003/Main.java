package J06003;

import HELLOJAR.PaymentController;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();
        ArrayList<SinhVien> sinhViens = new ArrayList<>();
        for (int i = 0; i < n; ++i) {
            String id = scanner.nextLine();
            String name = scanner.nextLine();
            String phone = scanner.nextLine();
            int groupId = scanner.nextInt();
            sinhViens.add(new SinhVien(id, name, phone, groupId));
        }
        ArrayList<Group> groups = new ArrayList<>();
        for (int i = 0; i < m; ++i) {
            groups.add(new Group(scanner.nextLine()));
        }

        for (SinhVien i : sinhViens) {
            for (Group j : groups) {
                if (i.getGroupId() == j.getId()) {
                    j.getSinhViens().add(i);
                }
            }
        }
        int q = scanner.nextInt();
        while (q-- > 0) {
            int id = scanner.nextInt();
            for (Group x : groups)
                if (x.getId() == id) System.out.println(x);
        }
    }
}
/*
5 2
B17DTCN001
Nguyen Chi  Linh
0987345543
1
B17DTCN011
Vu Viet Thang
0981234567
1
B17DTCN023
Pham Trong Thang
0992123456
1
B17DTCN022
Nguyen Van  Quyet
0977865432
2
B17DTCN031
Ngo Thanh Vien
0912313111
2
Xay dung website ban dien thoai truc tuyen
Xay dung ung dung quan ly benh nhan Covid-19
1
1
*/