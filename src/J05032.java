import java.util.*;
import java.io.*;

public class J05032 {
    public static class Nguoi {
        private String ten, ngaySinh;
        private String ngay, thang, nam;
        public Nguoi(String ten, String ngaySinh) {
            this.ten = ten;
            this.ngaySinh = ngaySinh;
            String[] temp = ngaySinh.replace("/", " ").trim().split("\\s+");
            this.ngay = temp[0];
            this.thang = temp[1];
            this.nam = temp[2];
        }

        public String getNgaySinh() {
            return nam + thang + ngay;
        }

        @Override
        public String toString() {
            return ten;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Nguoi> list = new ArrayList<>();
        while (n-- > 0) {
            list.add(new Nguoi(sc.next(), sc.nextLine()));
        }
        list.sort(Comparator.comparing(Nguoi::getNgaySinh).reversed());
        System.out.println(list.get(0) + "\n" + list.get(list.size() - 1));
    }
}
/*
5
Nam 01/10/1991
An 30/12/1990
Binh 15/08/1993
Tam 18/09/1990
Truong 20/09/1990
 */