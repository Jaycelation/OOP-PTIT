package J06008;

public class GiangVien {
    private String maGV, tenGV;
    private double tongGio;
    public GiangVien(String maGV, String tenGV) {
        this.maGV = maGV;
        this.tenGV = tenGV;
    }

    public double getTongGio() {
        return tongGio;
    }

    public void setTongGio(double tongGio) {
        this.tongGio = tongGio;
    }

    @Override
    public String toString() {
        return tenGV;
    }
}
