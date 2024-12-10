import java.util.*;
import java.io.*;

public class J05080 {
    public static class Lop {
        private String maMH, tenMH, nhomLop, tenGV;

        public Lop(String maMH, String tenMH, String nhomLop, String tenGV) {
            this.maMH = maMH;
            this.tenMH = tenMH;
            this.nhomLop = nhomLop;
            this.tenGV = tenGV;
        }

        public String getMaMH() {
            return maMH;
        }

        public String getNhomLop() {
            return nhomLop;
        }

        public String getTenGV() {
            return tenGV;
        }

        @Override
        public String toString() {
            return maMH + " " + tenMH + " " + nhomLop;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Lop> list = new ArrayList<>();
        while (n-- > 0) {
            list.add(new Lop(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        n = Integer.parseInt(sc.nextLine());
        while (n-- > 0) {
            String tenGV = sc.nextLine();
            System.out.println("Danh sach cho giang vien " + tenGV + ":");
            list.sort(Comparator.comparing(Lop::getMaMH).thenComparing(Lop::getNhomLop));
            for (Lop i : list) {
                if (i.getTenGV().equals(tenGV)) {
                    System.out.println(i);
                }
            }
        }
    }
}
/*
4
THCS2D20
Tin hoc co so 2 - D20
01
Nguyen Binh An
CPPD20
Ngon ngu lap trinh C++ - D20
01
Le Van Cong
THCS2D20
Tin hoc co so 2 - D20
02
Nguyen Trung Binh
LTHDTD19
Lap trinh huong doi tuong - D19
01
Nguyen Binh An
1
Nguyen Binh An
 */