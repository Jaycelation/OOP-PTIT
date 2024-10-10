package HELLOJAR;

import java.util.*;
import vn.edu.ptit.Invoice;
import vn.edu.ptit.Rule;
import vn.edu.ptit.Student;
import vn.edu.ptit.Subject;

public class PaymentController {
    private Invoice invoice;
    private Rule rule;
    private Student student;
    private Subject subject;

    public PaymentController() {
        Scanner scanner = new Scanner(System.in);
        String id = scanner.nextLine();
        String hoTen = scanner.nextLine();
        int soMonHoc = Integer.parseInt(scanner.nextLine());
        String maMonHoc, tenMonHoc;
        int soTinChi;
        Student student = new Student(id, hoTen);
        ArrayList<Subject> arrayList = new ArrayList<>();
        while (soMonHoc-- > 0) {
            maMonHoc = scanner.nextLine();
            tenMonHoc = scanner.nextLine();
            soTinChi = Integer.parseInt(scanner.nextLine());
            arrayList.add(new Subject(tenMonHoc, maMonHoc, soTinChi));
        }
        String soQD = scanner.nextLine();
        String tenQD = scanner.nextLine();
        double donGia = Double.parseDouble(scanner.nextLine());
        double thanhTien = 0;
        for (Subject i : arrayList) {
            thanhTien += donGia * i.getCredit();
        }

        rule = new Rule(soQD, tenQD, thanhTien);
        invoice = new Invoice(rule);
        invoice.setAlSubject(arrayList);
        invoice.setAmount(thanhTien);
        invoice.setSt(student);

    }

    public Invoice getInvoice()
    {
        return invoice;
    }
}
