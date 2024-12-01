package J05011;


import java.util.*;
import java.io.*;
import java.util.zip.DataFormatException;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        ArrayList<Time> listT = new ArrayList<>();
        while (n-- > 0) {
            String id = scanner.nextLine();
            String name = scanner.nextLine();
            String timeStart = scanner.nextLine();
            String timeEnd = scanner.nextLine();
            listT.add(new Time(id, name, timeStart, timeEnd));
        }
        listT.sort(Comparator.comparing(Time::getTime).reversed());
        for (Time t : listT) {
            System.out.println(t);
        }

    }
}
/*
3
01T
Nguyen Van An
09:00
10:30
06T
Hoang Van Nam
15:30
18:00
02I
Tran Hoa Binh
09:05
10:00
 */