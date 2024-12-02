package danhsachsinhvien1;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SinhVien implements Serializable {
   private String ma;
   private String ten;
   private String lop;
   private Date ngaysinh;
   private float gpa;

   public SinhVien(int id, String ten, String lop, String ngaysinhStr, float gpa) throws ParseException {
        this.ma = "B20DCCN" + String.format("%3d", id);
        this.ten = ten;
        this.lop = lop;
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        this.ngaysinh = formatter.parse(ngaysinhStr);
        this.gpa = gpa;
   }

    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return ma + " " + ten + " " + lop + " " + sdf.format(ngaysinh) + " " + String.format("%.2f", gpa);
    }
}
