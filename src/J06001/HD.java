package J06001;


import java.util.*;
import java.io.*;

/**
 * Create on 27/10/2024 12:57 by jayce
 */

public class HD {
    private String id;
    private int count;
    private SP sp;

    public HD(String id, int count, SP sp) {
        this.id = id;
        this.count = count;
        this.sp = sp;
    }

    public long giamGia() {
        if (count >= 150) {
            return tongTien() * 1/2;
        } else if (count >= 100) {
            return tongTien() * 3/10;
        } else if (count >= 50) {
            return tongTien() * 15/100;
        } else {
            return 0;
        }
    }

    public long tongTien() {
        char c = id.charAt(2);
        long price = 0;
        if (c-'0' == 1) {
            price = count * sp.getPrice1();
        } else {
            price = count * sp.getPrice2();
        }
        return price;
    }

    @Override
    public String toString() {
        return id + " " + sp + " " + giamGia() + " " + (tongTien()-giamGia());
    }
}
