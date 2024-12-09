package J07045;


public class LoaiPhong implements Comparable<LoaiPhong>{
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

    @Override
    public int compareTo(LoaiPhong o) {
        return this.tenP.compareTo(o.tenP);
    }

    @Override
    public String toString() {
        return kyHieu + " " + tenP + " " + donGia + " " + phiPV;
    }

}
