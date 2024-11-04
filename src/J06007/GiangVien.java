package J06007;


import java.util.*;
import java.io.*;

/**
 * Create on 27/10/2024 13:25 by jayce
 */

public class GiangVien {
    private String id, name;

    public GiangVien(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return name;
    }
}
