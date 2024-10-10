package J04006;

public class SinhVien {
    public String id = "B20DCCN001";
    private String name, group, dob;
    private double gpa;

    public SinhVien() {
    }

    public SinhVien(String id, String name, String group, String dob, double gpa) {
        this.id = id;
        this.name = name;
        this.group = group;
        this.dob = dob;
        this.gpa = gpa;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
}
