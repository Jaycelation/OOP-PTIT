package J06006;


import java.util.*;
import java.io.*;

/**
 * Create on 27/10/2024 09:19 by jayce
 */

public class MH {
    private String id, name, unit;
    private int buy, sell;

    public MH(String id, String name, String unit, int buy, int sell) {
        this.id = id;
        this.name = name;
        this.unit = unit;
        this.buy = buy;
        this.sell = sell;
    }

    public String getId() {
        return id;
    }

    public int getBuy() {
        return buy;
    }

    public int getSell() {
        return sell;
    }

    @Override
    public String toString() {
        return name;
    }
}
