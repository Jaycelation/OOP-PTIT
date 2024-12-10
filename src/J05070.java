import java.util.*;
import java.io.*;

public class J05070 {
    public static class CLB {
        private String maCLB, tenCLB;
        private int giaVe;

        public CLB(String maCLB, String tenCLB, int giaVe) {
            this.maCLB = maCLB;
            this.tenCLB = tenCLB;
            this.giaVe = giaVe;
        }

        public String getTenCLB() {
            return tenCLB;
        }

        public int getGiaVe() {
            return giaVe;
        }

        public String getMaCLB() {
            return maCLB;
        }

        @Override
        public String toString() {
            return tenCLB;
        }
    }
    public static class Tran {
        private String maTran;
        private CLB clb;
        private int soLuong;
        private int doanhThu;
        public Tran(String maTran, CLB clb, int soLuong) {
            this.maTran = maTran;
            this.clb = clb;
            this.soLuong = soLuong;
            this.doanhThu = soLuong * clb.getGiaVe();
        }

        public String getTenCLB() {
            return clb.getTenCLB();
        }

        public int getDoanhThu() {
            return doanhThu;
        }

        @Override
        public String toString() {
            return maTran + " " + clb + " " + doanhThu;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<CLB> listCLB = new ArrayList<>();
        while (n-- > 0) {
            listCLB.add(new CLB(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine())));
        }
        n = Integer.parseInt(sc.nextLine());
        ArrayList<Tran> listT = new ArrayList<>();
        while (n-- > 0) {
            String[] line = sc.nextLine().split("\\s+");
            String maTran = line[0];
            String maCLB = maTran.substring(1, 3);
            int soLuong = Integer.parseInt(line[1]);
            CLB clb = null;
            for (CLB c : listCLB) {
                if (c.getMaCLB().equals(maCLB)) {
                    clb = c;
                    break;
                }
            }
            listT.add(new Tran(maTran, clb, soLuong));
        }
        listT.sort(Comparator.comparing(Tran::getDoanhThu).reversed().thenComparing(Tran::getTenCLB));
        for (Tran i : listT) {
            System.out.println(i);
        }
    }
}
/*
2
AC
AC Milan
12
MU
Manchester United
10
2
IAC1 80000
EMU2 60000
 */