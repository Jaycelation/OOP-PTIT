package TN02012;


import java.util.*;
import java.io.*;

public class PhongBan {
    private String maPB, tenPB;

    public PhongBan(String maPB, String tenPB) {
        this.maPB = maPB;
        this.tenPB = tenPB;
    }

    public String getMaPB() {
        return maPB;
    }


    @Override
    public String toString() {
        return tenPB;
    }
}
