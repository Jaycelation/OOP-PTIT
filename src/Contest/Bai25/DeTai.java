package Contest.Bai25;


public class DeTai {
    private String maDT, tenGV, tenDT;

    public DeTai(String maDT, String tenGV, String tenDT) {
        this.maDT = maDT;
        this.tenGV = tenGV;
        this.tenDT = tenDT;
    }

    public String getTenDT() {
        return tenDT;
    }

    public String getMaDT() {
        return maDT;
    }

    @Override
    public String toString() {
        return tenDT + " " + tenGV;
    }
}