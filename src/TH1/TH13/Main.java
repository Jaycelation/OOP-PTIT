package TH13;

import java.text.ParseException;
import java.util.*;
import java.io.*;

/**
 * Create on 06/10/2024 15:28 by jayce
 */

/*13. BẢO HÀNH SẢN PHẨM
Input
MUAHANG.in
Output
KH02 Nguyen Sao Mai Hoan Kiem KC742 782 06/02/2010
KH01 Le Ngoc Long Hoang Mai KC740 429 21/11/2010
 */

public class Main {
    public static void main(String[] args) throws FileNotFoundException, IOException, ParseException {
        Scanner sc = new Scanner(new File("MUAHANG.in"));
        int t = sc.nextInt();
        HashMap<String, SanPham> hashMap = new HashMap<>();
        while (t-- > 0) {
            sc.nextLine();
            String maSP = sc.nextLine();
            String tenSP = sc.nextLine();
            long giaSP = sc.nextLong();
            long baoHanh = sc.nextLong();
            SanPham x = new SanPham(maSP, tenSP, giaSP, baoHanh);
            hashMap.put(x.getMaSP(), x);
        }
        int n = sc.nextInt();
        ArrayList<KhachHang> list = new ArrayList<>();
        for(int i = 1; i <= n; i++) {
            sc.nextLine();
            String tenKH = sc.nextLine();
            String diaChi = sc.nextLine();
            SanPham sanPham = hashMap.get(sc.next());
            int soLuong = sc.nextInt();
            String ngayMua = sc.next();
            list.add(new KhachHang(tenKH, diaChi, sanPham, soLuong, ngayMua));
        }
        Collections.sort(list);
        for(KhachHang khachHang : list) {
            System.out.println(khachHang);
        }
    }
}
