package J07028;


public class GiangVien {
    private String maGV, tenGV;

    public GiangVien(String maGV, String tenGV) {
        this.maGV = maGV;
        this.tenGV = tenGV;
    }

    public String getMaGV() {
        return maGV;
    }

    @Override
    public String toString() {
        return tenGV;
    }
}
