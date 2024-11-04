package J06006;


import java.util.*;
import java.io.*;

/**
 * Create on 27/10/2024 09:19 by jayce
 */

public class HD {
    private String id;
    private int count;
    private KH kh;
    private MH mh;
    private long profit;
    public HD(String id, KH kh, MH mh, int count) {
        this.id = id;
        this.count = count;
        this.kh = kh;
        this.mh = mh;
    }

    public long thanhTien() {
        return count * mh.getSell();
    }

    public long loiNhuan() {
        return thanhTien() - count * mh.getBuy();
    }

    public long getProfit() {
        return loiNhuan();
    }

    @Override
    public String toString() {
        return id + " " + kh + " " + mh + " " + count + " " + thanhTien() + " " + loiNhuan();
    }
}
