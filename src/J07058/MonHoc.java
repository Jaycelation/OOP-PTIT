package J07058;

public class MonHoc {
    private String id, name, form;

    public MonHoc(String id, String name, String form) {
        this.id = id;
        this.name = name;
        this.form = form;
    }

    public MonHoc() {
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

    public String getForm() {
        return form;
    }

    public void setForm(String form) {
        this.form = form;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + form;
    }
}
