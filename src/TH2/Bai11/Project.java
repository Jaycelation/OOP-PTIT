package Bai11;


import java.util.*;
import java.io.*;

/**
 * Create on 03/11/2024 15:30 by jayce
 */

public class Project {
    private String name;
    private Student student;

    public Project(String name, Student student) {
        this.name = name;
        this.student = student;
    }

    public String getSP() {
        return student.getPhone();
    }

    public String idS() {
        return student.getId();
    }

    @Override
    public String toString() {
        return student + " " + name + " " + getSP();
    }
}
