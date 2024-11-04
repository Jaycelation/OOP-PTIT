package J06007;


import java.util.*;
import java.io.*;

/**
 * Create on 27/10/2024 13:28 by jayce
 */

public class HocPhan {
    private double time;
    private GiangVien gv;
    private MonHoc mh;

    public HocPhan(GiangVien gv, MonHoc mh, double time) {
        this.gv = gv;
        this.mh = mh;
        this.time = time;
    }

    @Override
    public String toString() {
        return gv + " " + String.format("%.2f",time);
    }
}
