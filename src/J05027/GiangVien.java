package J05027;


public class GiangVien {
    private String maGV, tenGV, khoa;

    public GiangVien(String maGV, String tenGV, String khoa) {
        this.maGV = maGV;
        this.tenGV = tenGV;
        String[] line = khoa.toUpperCase().split("\\s+");
        String val = "";
        for (int i = 0; i < line.length; i++) {
            val += line[i].substring(0, 1);
        }
        this.khoa = val;
    }

    public String getTenGV() {
        return tenGV;
    }

    public String getMaGV() {
        return maGV;
    }

    @Override
    public String toString() {
        return maGV + " " + tenGV + " " + khoa;
    }
}
