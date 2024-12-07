import java.util.*;
import java.io.*;

public class J07024 {
    public static class WordSet {
        private TreeSet<String> set = new TreeSet<>();

        WordSet(String fileName) throws FileNotFoundException {
            Scanner sc = new Scanner(new File(fileName));
            while(sc.hasNext()){
                String s = sc.next().toLowerCase();
                this.set.add(s);
            }
        }

        WordSet(TreeSet<String> a){
            this.set = a;
        }
        WordSet difference(WordSet b){
            TreeSet<String> x = (TreeSet<String>) this.set.clone();
            TreeSet<String> y = b.set;
            x.removeAll(y);
            return new WordSet(x);
        }

        @Override
        public String toString() {
            String result = "";
            for (String s : set) {
                result += s + " ";
            }
            return result.trim();
        }
    }
    public static void main(String[] args) throws IOException {
        WordSet s1 = new WordSet("DATA1.in");
        WordSet s2 = new WordSet("DATA2.in");
        System.out.println(s1.difference(s2));
        System.out.println(s2.difference(s1));
    }
    public static void main4927566(String[] args) throws IOException {
        WordSet s1 = new WordSet("DATA1.in");
        WordSet s2 = new WordSet("DATA2.in");
        System.out.println(s1.difference(s2));
        System.out.println(s2.difference(s1));
    }
}
