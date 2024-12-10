package J05072;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.concurrent.TimeUnit;

public class CuocGoi {
    private String sdt, thoiGianGoi, thoiGianKT;
    private ThanhPho thanhPho;
    private long soPhut, giaCuoc;

    public CuocGoi(String sdt, String thoiGianGoi, String thoiGianKT, ThanhPho thanhPho) {
        this.sdt = sdt;
        this.thoiGianGoi = thoiGianGoi;
        this.thoiGianKT = thoiGianKT;
        this.thanhPho = thanhPho;
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
        try {
            long timeStart = sdf.parse(thoiGianGoi).getTime();
            long timeEnd = sdf.parse(thoiGianKT).getTime();
            long time = timeEnd - timeStart;
            soPhut = TimeUnit.MILLISECONDS.toSeconds(time) / 60;
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

        if (sdt.charAt(0) == '0') {
            this.giaCuoc = thanhPho.getGiaCuoc() * soPhut;
        } else {
            if (soPhut % 3 == 0) {
                soPhut /= 3;
            } else {
                soPhut = soPhut / 3 + 1;
            }
            this.giaCuoc = Math.round(800 * soPhut);
        }
    }

    public long getGiaCuoc() {
        return giaCuoc;
    }

    @Override
    public String toString() {
        if (thanhPho != null) {
            return sdt + " " + thanhPho + " " + soPhut + " " + giaCuoc;
        }
        else {
            return sdt + " " + "Noi mang" + " " + soPhut + " " + giaCuoc;
        }
    }
}
