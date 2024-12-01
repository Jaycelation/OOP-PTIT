package TH2_2.Bai3;

public class Student {
    private String id;
    private String name;
    private String classes;
    private String email;
    private String phone;

    public Student(String id, String name, String classes, String email, String phone) {
        this.id = id;
        this.name = name;
        this.classes = classes;
        this.email = email;
        this.phone = "0" + phone;
    }

    public String getId() {
        return id;
    }

    public String getClasses() {
        return classes;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + classes + " " + email + " " + phone;
    }
}
