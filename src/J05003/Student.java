package J05003;


import java.util.*;
import java.io.*;

/**
 * Create on 15/10/2024 16:11 by jayce
 */

public class Student {
    private String id, name, classNo, dob;
    private double gpa;

    public Student() {
    }

    public Student(String id, String name, String classNo, String dob, double gpa) {
        this.id = id;
        this.name = name;
        this.classNo = classNo;
        this.dob = dob;
        this.gpa = gpa;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getClassNo() {
        return classNo;
    }

    public String getDob() {
        return dob;
    }

    public double getGpa() {
        return gpa;
    }

    private void chuanHoa() {
        if (dob.charAt(2) != '/') {
            dob = "0" + dob;
        }
        if (dob.charAt(5) != '/') {
            dob = dob.substring(0, 3) + "0" + dob.substring(3);
        }
    }

    @Override
    public String toString() {
        chuanHoa();
        return this.id + " " + this.name + " " + this.classNo + " " + this.dob + " " + String.format("%.2f", this.gpa);
    }
}