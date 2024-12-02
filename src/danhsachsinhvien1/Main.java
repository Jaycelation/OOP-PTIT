package danhsachsinhvien1;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, FileNotFoundException, ClassNotFoundException {
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("SV.in"));
        ArrayList<SinhVien> listSV = (ArrayList<SinhVien>) objectInputStream.readObject();
        for (SinhVien sv : listSV) {
            System.out.println(sv);
        }
    }
}
