package J07060;


import java.util.*;
import java.io.*;

public class LichThi {
    private CaThi caThi;
    private MonThi monThi;
    private String maN;
    private int soSV;
    public LichThi(CaThi caThi, MonThi monThi, String maN, int soSV) {
        this.caThi = caThi;
        this.monThi = monThi;
        this.maN = maN;
        this.soSV = soSV;
    }

    public String getTime() {
        return caThi.getTime();
    }

    public String getMaCT() {
        return caThi.getMaCT();
    }

    @Override
    public String toString() {
        return caThi + " " + monThi + " " + maN + " " + soSV;
    }
}