package Bai2;

import java.util.*;

public class WordSet {
    private Set<String> wordSet;
    public WordSet(String line) {
        wordSet = new TreeSet<>(Arrays.asList(line.toLowerCase().split("\\s+")));
    }
    public WordSet union(WordSet other) {
        Set<String> result = new TreeSet<>(wordSet);
        result.addAll(other.wordSet);
        return new WordSet(String.join(" ", result));
    }

    public WordSet intersection(WordSet other) {
        Set<String> result = new TreeSet<>(wordSet);
        result.retainAll(other.wordSet);
        return new WordSet(String.join(" ", result));
    }

    @Override
    public String toString() {
        return String.join(" ", wordSet);
    }
}
