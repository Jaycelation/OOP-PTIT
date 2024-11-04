package J04021;


import java.util.*;
import java.io.*;

/**
 * Create on 29/10/2024 17:01 by jayce
 */

public class IntSet {
    private Set<Integer> set;
    public IntSet(int[] arr) {
        this.set = new TreeSet<>();
        for (int i : arr) {
            set.add(i);
        }
    }

    public IntSet union(IntSet other) {
        Set<Integer> unionSet = new TreeSet<>(this.set);
        unionSet.addAll(other.set);
        int[] result = new int[unionSet.size()];
        int i = 0;
        for (int num : unionSet) {
            result[i++] = num;
        }
        return new IntSet(result);
    }

    public IntSet intersection(IntSet other) {
        Set<Integer> intersectionSet = new TreeSet<>(this.set);
        intersectionSet.retainAll(other.set);
        int[] result = new int[intersectionSet.size()];
        int i = 0;
        for (int num : intersectionSet) {
            result[i++] = num;
        }
        return new IntSet(result);
    }

    @Override
    public String toString() {
        String result = "";
        for (int num : set) {
            result += num + " ";
        }
        return result.toString().trim();
    }
}
