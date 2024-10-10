package J06003;

import java.util.ArrayList;

public class Group {
    private int stt = 0;
    private int id;
    private String baiTap;
    private ArrayList<SinhVien> sinhViens;

    public Group(String baiTap) {
        id = stt++;
        sinhViens = new ArrayList<>();
        this.baiTap = baiTap;
    }

    public int getStt() {
        return stt;
    }

    public void setStt(int stt) {
        this.stt = stt;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBaiTap() {
        return baiTap;
    }

    public void setBaiTap(String baiTap) {
        this.baiTap = baiTap;
    }

    public ArrayList<SinhVien> getSinhViens() {
        return sinhViens;
    }

    public void setSinhViens(ArrayList<SinhVien> sinhViens) {
        this.sinhViens = sinhViens;
    }

    @Override
    public String toString() {
        String result = String.format("DANH SACH NHOM %d:\n", stt);
        for (SinhVien x : sinhViens)
            result += (x.toString() + "\n");
            result += String.format("Bai tap dang ky: %s", baiTap);
        return result;
    }
}
