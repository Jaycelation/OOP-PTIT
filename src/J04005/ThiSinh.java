package J04005;

public class ThiSinh {
    private String name, dob;
    private double point1, point2, point3;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public double getPoint1() {
        return point1;
    }

    public void setPoint1(double point1) {
        this.point1 = point1;
    }

    public double getPoint2() {
        return point2;
    }

    public void setPoint2(double point2) {
        this.point2 = point2;
    }

    public double getPoint3() {
        return point3;
    }

    public void setPoint3(double point3) {
        this.point3 = point3;
    }

    public ThiSinh(String name, String dob, double point1, double point2, double point3) {
        this.name = name;
        this.dob = dob;
        this.point1 = point1;
        this.point2 = point2;
        this.point3 = point3;
    }

    public double getTotal() {
        return this.point1 + this.point2 + this.point3;
    }


}
