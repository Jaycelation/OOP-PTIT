package J07058;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("MONHOC.in"));
        int t = scanner.nextInt();
        scanner.nextLine();
        ArrayList<MonHoc> mt = new ArrayList<>();
        for(int i=0;i<t;i++){
            MonHoc x = new MonHoc(scanner.nextLine(), scanner.nextLine(), scanner.nextLine());
            mt.add(x);
        }
        Collections.sort(mt, new Comparator<MonHoc>() {
            @Override
            public int compare(MonHoc o1, MonHoc o2) {
                return o1.getId().compareTo(o2.getId());
            }
        });
        for(MonHoc x:mt){
            System.out.println(x);
        }
    }
}