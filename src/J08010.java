import java.util.*;

public class J08010 {
    public static boolean check(String input) {
        StringBuilder stringBuilder = new StringBuilder(input);
        stringBuilder.reverse();
        return input.equals(stringBuilder.toString());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> arrayList = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();
        int maxLen = -1;
        while (scanner.hasNext()) {
            String input = scanner.next();
            if (check(input)) {
                maxLen = Math.max(maxLen, input.length());
                if (map.containsKey(input)) {
                    map.put(input, map.get(input)+1); //Neu chuoi da ton tai trong hashmap, tang so lan xuat hien len 1
                }
                else {
                    arrayList.add(input);
                    map.put(input, 1);
                }
            }
        }

        for (String i : arrayList) {
            if (i.length() == maxLen) {
                System.out.println(i + " " + map.get(i));
            }
        }

    }
}
