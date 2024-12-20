package J07035;

public class BangDiem {
    private SinhVien sinhVien;
    private MonHoc monHoc;
    private String diem;

    public BangDiem(SinhVien sinhVien, MonHoc monHoc, String diem) {
        this.sinhVien = sinhVien;
        this.monHoc = monHoc;
        this.diem = diem;
    }

    public SinhVien getSinhVien() {
        return sinhVien;
    }

    public MonHoc getMonHoc() {
        return monHoc;
    }

    public String getMaSV() {
        return sinhVien.getMaSV();
    }

    public double getDiem() {
        return Double.parseDouble(diem);
    }

    @Override
    public String toString() {
        return sinhVien + " " + diem;
    }
}