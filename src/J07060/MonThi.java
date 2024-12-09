package J07060;


import java.util.*;
import java.io.*;

public class MonThi {
    private String maM, tenM, hinhThuc;

    public MonThi(String maM, String tenM, String hinhThuc) {
        this.maM = maM;
        this.tenM = tenM;
        this.hinhThuc = hinhThuc;
    }

    public String getMaM() {
        return maM;
    }

    @Override
    public String toString() {
        return tenM;
    }
}
