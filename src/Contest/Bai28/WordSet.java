package Contest.Bai28;


import java.util.*;
import java.io.*;

public class WordSet {
    private TreeSet<String> words;

    public WordSet(String line) {
        words = new TreeSet<>();
        String[] tokens = line.toLowerCase().split("\\s+");
        for (String token : tokens) {
            words.add(token);
        }
    }

    public WordSet union(WordSet other) {
        WordSet result = new WordSet("");
        result.words.addAll(this.words);
        result.words.addAll(other.words);
        return result;
    }

    public WordSet intersection(WordSet other) {
        WordSet result = new WordSet("");
        for (String word : this.words) {
            if (other.words.contains(word)) {
                result.words.add(word);
            }
        }
        return result;
    }

    @Override
    public String toString() {
        String result = "";
        for (String word : words) {
            result += word + " ";
        }
        return result;
    }
}
