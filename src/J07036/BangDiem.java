package J07036;

public class BangDiem {
    private SinhVien sinhVien;
    private MonHoc monHoc;
    private String diem;

    public BangDiem(SinhVien sinhVien, MonHoc monHoc, String diem) {
        this.sinhVien = sinhVien;
        this.monHoc = monHoc;
        this.diem = diem;
    }

    public String getMaMH() {
        return monHoc.getMaMH();
    }

    public String getMaSV() {
        return sinhVien.getMaSV();
    }

    public String getLop() {
        return sinhVien.getLop();
    }

    @Override
    public String toString() {
        return sinhVien + " " + monHoc + " " + diem;
    }
}
