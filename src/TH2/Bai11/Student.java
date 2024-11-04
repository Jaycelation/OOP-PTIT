package Bai11;


import java.util.*;
import java.io.*;

/**
 * Create on 03/11/2024 15:28 by jayce
 */

public class Student {
    private String id, name, classess, gmail, phone;

    public Student(String id, String name, String classess, String gmail, String phone) {
        this.id = id;
        this.name = name;
        this.classess = classess;
        this.gmail = gmail;
        this.phone = phone;
    }

    public String getId() {
        return id;
    }

    public String getPhone() {
        return phone;
    }

    @Override
    public String toString() {
        return id + " " + name;
    }
}
