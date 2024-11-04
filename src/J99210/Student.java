package J99210;


import java.util.*;
import java.io.*;

/**
 * Create on 25/10/2024 21:38 by jayce
 */

public class Student {
    private String id, name, classes, email, phone, sex;

    public Student(String id, String name, String sex, String classes, String email, String phone) {
        this.id = id;
        this.name = name;
        this.classes = classes;
        this.email = email;
        this.phone = phone;
        this.sex = sex;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getClasses() {
        return classes;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getSex() {
        return sex;
    }

    @Override
    public String toString() {
        return this.id + " " + this.name + " " + this.classes + " " + this.email + " " + this.phone;
    }
}
