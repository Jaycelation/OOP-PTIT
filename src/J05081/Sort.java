package J05081;


import java.util.*;

/**
 * Create on 09/10/2024 14:36 by jayce
 */

public class Sort implements Comparator<MatHang> {
    public int compare(MatHang o1, MatHang o2) {
        if (o1.loiNhuan() != o2.loiNhuan()) {
            if (o1.loiNhuan() < o2.loiNhuan()) {
                return 1;
            } return -1;
        } else {
            return o1.getIdMh().compareTo(o2.getIdMh());
        }
    }
}
