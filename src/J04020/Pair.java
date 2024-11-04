package J04020;


import java.util.*;
import java.io.*;

/**
 * Create on 29/10/2024 16:54 by jayce
 */

public class Pair <K, V> {
    private K key;
    private V value;
    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    private boolean check(Integer n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return n > 1;
    }

    public boolean isPrime() {
        return check((Integer) this.key) && check((Integer) this.value);
    }

    @Override
    public String toString() {
        return key + " " + value;
    }
}
