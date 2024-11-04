package J05081;


/**
 * Create on 09/10/2024 14:27 by jayce
 */

public class MatHang {
    private String idMh, tenMh, donVi;
    private int giaMua, giaBan;

    public MatHang(String idMh, String tenMh, String donVi, int giaMua, int giaBan) {
        this.idMh = idMh;
        this.tenMh = tenMh;
        this.donVi = donVi;
        this.giaMua = giaMua;
        this.giaBan = giaBan;
    }

    public MatHang() {
    }

    public int loiNhuan() {
        return this.giaBan - this.giaMua;
    }

    public String getIdMh() {
        return idMh;
    }

    public String getTenMh() {
        return tenMh;
    }

    public String getDonVi() {
        return donVi;
    }

    public int getGiaMua() {
        return giaMua;
    }

    public int getGiaBan() {
        return giaBan;
    }

    @Override
    public String toString() {
        return this.idMh + " " + this.tenMh + " " + this.donVi + " " + this.giaMua + " " + this.giaBan + " " + this.loiNhuan();
    }
}
