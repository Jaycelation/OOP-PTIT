package TH10;

import java.util.*;
import java.io.*;

/**
 * Create on 06/10/2024 14:19 by jayce
 */

public class sinhVien {
    private String name, dayStart, dayEnd;
    private int time;
    public sinhVien(String name, String dayStart, String dayEnd, int time) {
        this.name = name;
        this.dayStart = dayStart;
        this.dayEnd = dayEnd;
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public String getDayStart() {
        return dayStart;
    }

    public String getDayEnd() {
        return dayEnd;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return this.name + " " + this.time;
    }
}
