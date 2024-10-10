package J06003;

public class SinhVien {
    private String id, name, phone;
    private int groupId;

    public SinhVien(String id, String name, String phone, int groupId) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.groupId = groupId;
    }

    public SinhVien() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getGroupId() {
        return groupId;
    }

    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }
}
