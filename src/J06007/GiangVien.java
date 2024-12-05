package J06007;


import java.util.*;
import java.io.*;

public class GiangVien {
    private String id, name;
    private double time;
    public GiangVien(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public double getTime() {
        return time;
    }

    public void setTime(double time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return name;
    }
}
