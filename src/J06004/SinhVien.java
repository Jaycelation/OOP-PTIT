package J06004;

public class SinhVien {
    private String id, name, phone, groupId, project;

    public SinhVien(String id, String name, String phone, String groupId) {
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

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }

    @Override
    public String toString() {
        return this.id + " " + this.name + " " + this.phone + " " + this.groupId + " " + this.project;
    }
}
