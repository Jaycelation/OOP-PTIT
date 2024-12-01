package J07020;

public class MatHang {
    private String id = "MH";
    private int count = 1;
    private String name;
    private String unit;
    private int buyCost;
    private int sellCost;

    public MatHang(String name, String unit, int buyCost, int sellCost) {
        this.id = id + String.format("%03d", count);
        count++;
        this.name = name;
        this.unit = unit;
        this.buyCost = buyCost;
        this.sellCost = sellCost;
    }

    public String getId() {
        return id;
    }

    public int total() {

        return 0;
    }

    @Override
    public String toString() {
        return unit + " " + buyCost + " " + sellCost + " " + total();
    }
}
