package J06005;


import java.util.*;
import java.io.*;

/**
 * Create on 27/10/2024 12:43 by jayce
 */

public class MH {
    private String id, name, unit;
    private int buy, sell;

    public String getId() {
        return id;
    }

    public int getBuy() {
        return buy;
    }

    public int getSell() {
        return sell;
    }

    public MH(String id, String name, String unit, int buy, int sell) {
        this.id = id;
        this.name = name;
        this.unit = unit;
        this.buy = buy;
        this.sell = sell;
    }

    @Override
    public String toString() {
        return name + " " + unit + " " + buy + " " + sell;
    }
}
