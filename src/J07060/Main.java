package J07060;


import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, FileNotFoundException {
        Scanner scanner = new Scanner(new File("MONTHI.in"));

        int n = Integer.parseInt(scanner.nextLine());
        ArrayList<MonThi> listMT = new ArrayList<>();
        while (n-- > 0) {
            listMT.add(new MonThi(scanner.nextLine(), scanner.nextLine(), scanner.nextLine()));
        }

        scanner = new Scanner(new File("CATHI.in"));
        ArrayList<CaThi> listCT = new ArrayList<>();
        n = Integer.parseInt(scanner.nextLine());
        int cnt = 1;
        while (n-- > 0) {
            listCT.add(new CaThi("C" + String.format("%03d", cnt++), scanner.nextLine(), scanner.nextLine(), scanner.nextLine()));
        }

        scanner = new Scanner(new File("LICHTHI.in"));
        n = Integer.parseInt(scanner.nextLine());
        ArrayList<LichThi> listLT = new ArrayList<>();
        while (n-- > 0) {
            String[] line = scanner.nextLine().split("\\s+");
            String maCT = line[0];
            String maM = line[1];
            String maN = line[2];
            int soSV = Integer.parseInt(line[3]);

            CaThi caThi = null;
            MonThi monThi = null;
            for (CaThi ct : listCT) {
                if (ct.getMaCT().equals(maCT)) {
                    caThi = ct;
                    break;
                }
            }

            for (MonThi mt : listMT) {
                if (mt.getMaM().equals(maM)) {
                    monThi = mt;
                    break;
                }
            }
            listLT.add(new LichThi(caThi, monThi, maN, soSV));
        }
        listLT.sort(Comparator.comparing(LichThi::getTime).thenComparing(LichThi::getMaCT));
        for (LichThi lt : listLT) {
            System.out.println(lt);
        }

    }
}