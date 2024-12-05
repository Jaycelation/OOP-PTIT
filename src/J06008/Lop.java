package J06008;

public class Lop {
    private String maGV, maMH;
    private double gio;

    public Lop(String maGV, String maMH, double gio) {
        this.maGV = maGV;
        this.maMH = maMH;
        this.gio = gio;
    }

    public String getMaGV() {
        return maGV;
    }

    public String getMaMH() {
        return maMH;
    }

    public double getGio() {
        return gio;
    }
}
