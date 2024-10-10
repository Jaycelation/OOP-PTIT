package J05033;


import java.util.*;
import java.io.*;

/**
 * Create on 09/10/2024 13:25 by jayce
 */

public class Time {
    private int gio, phut, giay;

    public Time(int gio, int phut, int giay) {
        this.gio = gio;
        this.phut = phut;
        this.giay = giay;
    }

    public Time() {
    }

    public int getGio() {
        return gio;
    }

    public int getPhut() {
        return phut;
    }

    public int getGiay() {
        return giay;
    }

    @Override
    public String toString() {
        return gio + " " + phut + " " + giay;
    }
}
