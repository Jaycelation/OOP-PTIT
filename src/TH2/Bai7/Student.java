package Bai7;


import java.util.*;
import java.io.*;

/**
 * Create on 03/11/2024 13:44 by jayce
 */

public class Student {
    private String id, name, classes, gmail, phone, sex;

    public Student(String id, String name, String classes, String gmail, String phone, String sex) {
        this.id = id;
        this.name = name;
        this.classes = classes;
        this.gmail = gmail;
        this.phone = phone;
        this.sex = sex;
    }

    public String getId() {
        return id;
    }

    public String getSex() {
        return sex;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + classes + " " + gmail + " " + phone;
    }
}
