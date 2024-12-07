package Contest.Bai41;

public class KhachHang {
    private int count = 1;
    private String id = "KH";
    private String name;
    private String sex;
    private String dob;
    private String address;

    public KhachHang(String name, String sex, String dob, String address) {
        this.name = name;
        this.sex = sex;
        this.dob = dob;
        this.address = address;
        this.id = id + String.format("%03d", count);
        count++;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return name + " " + address;
    }
}
