package J04013;

public class SinhVien {
    private String id, name;
    private Double d1, d2, d3;

    public SinhVien(String id, String name, Double d1, Double d2, Double d3) {
        this.id = id;
        this.name = name;
        this.d1 = d1;
        this.d2 = d2;
        this.d3 = d3;
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

    public Double getD1() {
        return d1;
    }

    public void setD1(Double d1) {
        this.d1 = d1;
    }

    public Double getD2() {
        return d2;
    }

    public void setD2(Double d2) {
        this.d2 = d2;
    }

    public Double getD3() {
        return d3;
    }

    public void setD3(Double d3) {
        this.d3 = d3;
    }

    public double priority() {
        String kv = this.id.substring(0, 3);
        if (kv.equals("KV1")) return 0.5;
        else if (kv.equals("KV2")) return 1.0;
        else return 2.5;
    }

    public double result() {
        return d1*2 + d2 + d3;
    }

    public String status() {
        if (result() + priority() >= 24) {
            return "TRUNG TUYEN";
        }
        else {
            return "TRUOT";
        }
    }
    @Override
    public String toString() {
        if (priority() == 1.0) {
            if (result() == (int) result()) {
                int dt = (int) result();
                return this.id + " " + this.name + " " + 1 + " " + dt + " " + status();
            } else {
                return this.id + " " + this.name + " " + 1 + " " + String.format("%.1f", result()) + " " + status();
            }
        } else {
            if (result() == (int) result()) {
                int dt = (int) result();
                return this.id + " " + this.name + " " + String.format("%.1f", priority()) + " " + dt + " " + status();
            } else {
                return this.id + " " + this.name + " " + String.format("%.1f", priority()) + " " + String.format("%.1f", result()) + " " + priority();
            }
        }
    }
}
