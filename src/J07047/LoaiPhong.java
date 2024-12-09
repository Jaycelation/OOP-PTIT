package J07047;

public class LoaiPhong{
    private String kyHieu, tenP;
    private int donGia;
    private double phiPV;
    public LoaiPhong(String input) {
        String[] line = input.split("\\s+");
        this.kyHieu = line[0];
        this.tenP = line[1];
        this.donGia = Integer.parseInt(line[2]);
        this.phiPV = Double.parseDouble(line[3]);
    }

    public String getKyHieu() {
        return kyHieu;
    }

    public double getPhiPV() {
        return phiPV;
    }

    public int getDonGia() {
        return donGia;
    }

}
