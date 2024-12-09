package J07035;

public class SinhVien {
    private String maSV, tenSV, lop, email;
    public SinhVien(String maSV, String tenSV, String lop, String email) {
        this.maSV = maSV;
        String[] word = tenSV.toLowerCase().trim().split("\\s+");
        String temp = "";
        for (int i = 0; i < word.length; i++) {
            temp += word[i].substring(0, 1).toUpperCase() + word[i].substring(1);
            if (i != word.length - 1) {
                temp += " ";
            }
        }
        this.tenSV = temp;
        this.lop = lop;
        this.email = email;
    }

    public String getTenSV() {
        return tenSV;
    }

    public String getMaSV() {
        return maSV;
    }

    @Override
    public String toString() {
        return maSV + " " + tenSV + " " + lop;
    }
}