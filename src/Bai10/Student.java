package Bai10;

public class Student {
    private String id, name, classes, gmail, phone;

    public Student(String id, String name, String classes, String gmail, String phone) {
        this.id = id;
        this.name = name;
        this.classes = classes;
        this.gmail = gmail;
        this.phone = phone;
    }

    public String getId() {
        return id;
    }

    public String getClasses() {
        return classes;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + classes + " " + gmail + " " + phone + "\n";
    }
}
