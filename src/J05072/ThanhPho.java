package J05072;


public class ThanhPho {
    private String maVung, ten;
    private int giaCuoc;

    public ThanhPho(String maVung, String ten, int giaCuoc) {
        this.maVung = maVung;
        this.ten = ten;
        this.giaCuoc = giaCuoc;
    }

    public String getMaVung() {
        return maVung;
    }

    public int getGiaCuoc() {
        return giaCuoc;
    }

    @Override
    public String toString() {
        return ten;
    }
}
