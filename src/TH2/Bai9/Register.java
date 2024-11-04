package Bai9;


import java.util.*;
import java.io.*;

/**
 * Create on 03/11/2024 15:05 by jayce
 */

public class Register {
    private String idT;
    private String name;
    private Truong truong;
    public Register(String idT, String name, Truong truong) {
        this.idT = idT;
        this.name = name;
        this.truong = truong;
    }

    public String getT() {
        return truong.getName();
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name + " " + truong;
    }
}
