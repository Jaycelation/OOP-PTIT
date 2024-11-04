package J05020;


import java.util.*;
import java.io.*;

/**
 * Create on 25/10/2024 20:37 by jayce
 */

public class Student {
    private String id;
    private String name;
    private String classes;
    private String email;

    public Student() {
    }

    public Student(String id, String name, String classes, String email) {
        this.id = id;
        this.name = name;
        this.classes = classes;
        this.email = email;
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

    @Override
    public String toString() {
        return this.id + " " + this.name + " " + this.classes + " " + this.email;
    }
}
