package J05033;


import java.util.*;
import java.io.*;

/**
 * Create on 09/10/2024 13:26 by jayce
 */

public class SortTime implements Comparator<Time> {
    public int compare(Time o1, Time o2) {
        if (o1.getGio() != o2.getGio()) {
            if (o1.getGio() < o2.getGio()) {
                return -1;
            } else return 1;
        } else {
            if (o1.getPhut() != o2.getPhut()) {
                if (o1.getPhut() < o2.getPhut()) {
                    return -1;
                } else return 1;
            } else {
                if (o1.getGiay() != o2.getGiay()) {
                    if (o1.getGiay() < o2.getGiay()) {
                        return -1;
                    } else return 1;
                }
            }
        }
        return -1;
    }
}
