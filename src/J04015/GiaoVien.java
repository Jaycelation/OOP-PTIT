package J04015;

public class GiaoVien {
    private String id, name;
    private int income;

    public GiaoVien(String id, String name, int income) {
        this.id = id;
        this.name = name;
        this.income = income;
    }

    public GiaoVien() {
    }

    public int bonus(String id) {
        String header = id.substring(0, 2);
        int bonus = 0;
        if (header.equals("HT")) {
            bonus += 2000000;
        }
        else if (header.equals("HP")) {
            bonus += 900000;
        }
        else if (header.equals("GV")) {
            bonus += 500000;
        }
        return bonus;
    }

    public int coefficient(String id) {
        int val = Integer.parseInt(id.substring(2, 4));
        return val;
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

    public int getIncome() {
        return income;
    }

    public void setIncome(int income) {
        this.income = income;
    }

    @Override
    public String toString() {
        int coeff = coefficient(id);
        int bonusAmount = bonus(id);
        int totalIncome = coeff * income + bonusAmount;

        return id + " " + name + " " + coeff + " " + bonusAmount + " " + totalIncome + "\n";
    }
}
