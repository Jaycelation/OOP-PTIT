package J07027;


import java.util.*;
import java.io.*;

public class BaiTap {
    private int id;
    private String tenBT;

    public BaiTap(int id, String tenBT) {
        this.id = id;
        this.tenBT = tenBT;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return id + " " + tenBT;
    }
}
