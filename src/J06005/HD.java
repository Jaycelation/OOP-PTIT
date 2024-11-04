package J06005;


import java.security.PrivateKey;
import java.util.*;
import java.io.*;

/**
 * Create on 27/10/2024 12:43 by jayce
 */

public class HD {
    private String id;
    private int count;
    private KH kh;
    private MH mh;

    public HD(String id, int count, KH kh, MH mh) {
        this.id = id;
        this.count = count;
        this.kh = kh;
        this.mh = mh;
    }

    private long thanhTien() {
        return count * mh.getSell();
    }

    @Override
    public String toString() {
        return id + " " + kh + " " + mh + " " + count + " " + thanhTien();
    }
}
