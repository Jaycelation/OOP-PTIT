package J07019;


import java.util.*;
import java.io.*;

/**
 * Create on 26/10/2024 08:56 by jayce
 */

public class SP {
    private String id, name;
    private int price1, price2;

    public SP(String id, String name, int price1, int price2) {
        this.id = id;
        this.name = name;
        this.price1 = price1;
        this.price2 = price2;
    }

    public String getId() {
        return id;
    }

    public int getPrice1() {
        return price1;
    }

    public int getPrice2() {
        return price2;
    }

    @Override
    public String toString() {
        return name;
    }
}
