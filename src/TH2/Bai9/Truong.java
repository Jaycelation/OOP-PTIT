package Bai9;


import java.util.*;
import java.io.*;

/**
 * Create on 03/11/2024 15:04 by jayce
 */

public class Truong {
    private String id, name;

    public Truong(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}
