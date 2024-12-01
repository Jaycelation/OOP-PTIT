package J05066;


import java.util.*;
import java.io.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        ArrayList<NhanVien> listNV = new ArrayList<>();
        boolean checkGD = false, checkTP = false, checkPP = false;
        int countGD = 0, countTP = 0, countPP = 0;
        while (n-- > 0) {
            String[] input = scanner.nextLine().split("\\s+");
            String id = input[0];
            String hoTen = "";
            for (int i = 1; i < input.length; i++) {
                hoTen += input[i];
                if (i != input.length - 1) {
                    hoTen += " ";
                }
            }
            String chucVu = id.substring(0, 2);
            String heSoLuong = id.substring(2, 4);
            String soHieuNV = id.substring(4, 7);

            if (chucVu.equals("GD")) {
                if (countGD == 1) {
                    checkGD = true;
                } else {
                    countGD++;
                }
            }
            if (chucVu.equals("TP")) {
                if (countTP == 3) {
                    checkTP = true;
                } else {
                    countTP++;
                }
            }
            if (chucVu.equals("PP")) {
                if (countPP == 3) {
                    checkPP = true;
                } else {
                    countPP++;
                }
            }
            if (chucVu.equals("GD") && checkGD) {
                chucVu = "NV";
            }
            if (chucVu.equals("TP") && checkTP) {
                chucVu = "NV";
            }
            if (chucVu.equals("PP") && checkPP) {
                chucVu = "NV";
            }
            listNV.add(new NhanVien(hoTen, chucVu, heSoLuong, soHieuNV));
        }
        listNV.sort(Comparator.comparing(NhanVien::getHeSoLuong).thenComparing(NhanVien::getSoHieuNV).reversed());
        n = Integer.parseInt(scanner.nextLine());
        while (n-- > 0) {
            String search = scanner.nextLine().trim().toLowerCase();

            List<NhanVien> result = listNV.stream()
                    .filter(nv -> nv.getHoTen().toLowerCase().contains(search))
                    .collect(Collectors.toList());

            if (result.isEmpty()) {
                System.out.println();
            } else {
                result.forEach(System.out::println);
            }
            System.out.println();
        }

    }
}
/*
9
GD08001 Dang Duc Tai
GD08001 Nguyen Kim Loan
TP04004 Hoang Thanh Tuan
TP05005 Hoang Thanh Tuan
TP05002 Hoang Thanh Tu
TP05001 Tran Binh Nguyen
PP06002 Phan Trung Tuan
PP06001 Tran Quoc Huy
NV04003 Vo Van Lan
2
OA
aN
 */