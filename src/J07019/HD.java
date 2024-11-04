package J07019;


import java.util.*;
import java.io.*;

/**
 * Create on 26/10/2024 08:58 by jayce
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

    public long thanhTien() {
        long price = 0;
        char c = id.charAt(2);
        if (c-'0' == 1) {
            price = count * sp.getPrice1();
        } else {
            price = count * sp.getPrice2();
        }
        return price;
    }

    public double discount() {
        if (count >= 150) {
            return  thanhTien() * 50.0 / 100.0;
        } else if (count >= 100) {
            return thanhTien() * 30.0 / 100.0;
        } else if (count >= 50){
            return thanhTien() * 15.0 /100.0;
        } else {
            return 0.0;
        }
    }

    @Override
    public String toString() {
        return id + " " + sp + " " + String.format("%.0f", discount()) + " " + String.format("%.0f", thanhTien()-discount());
    }
}
