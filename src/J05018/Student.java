package J05018;


/**
 * Create on 25/10/2024 20:59 by jayce
 */

public class Student {
    private String name, id, grade;
    private double total;

    public Student(String name, String id, double total) {
        this.name = name;
        this.id = id;
        this.total = total;
    }

    public double getTotal() {
        return total;
    }

    public void xepLoai() {
        total = Math.round(total*10.0) / 10.0;
        if (total >= 9) {
            grade = "XUAT SAC";
        } else if (total >= 8){
            grade = "GIOI";
        } else if (total >= 7) {
            grade = "KHA";
        } else if (total >= 5) {
            grade = "TB";
        } else {
            grade = "YEU";
        }
    }

    @Override
    public String toString() {
        xepLoai();
        return this.id + " " + this.name + " " + this.total + " " + this.grade;
    }
}
