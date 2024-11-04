package J07054;


/**
 * Create on 03/11/2024 22:39 by jayce
 */

public class Student {
    private String id, name;
    private int d1, d2, d3, rank;
    public Student(String id, String name, int d1, int d2, int d3) {
        this.id = id;
        this.name = name;
        this.d1 = d1;
        this.d2 = d2;
        this.d3 = d3;
    }

    public double score() {
        double result = (this.d1*3 + this.d2*3 + this.d3*2) / 8.0;
        return result;
    }

    public double getScore() {
        return score();
    }

    public String getId() {
        return id;
    }
    public int getRank() {
        return rank;
    }
    public void setRank(int rank) {
        this.rank = rank;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + String.format("%.2f", score()) + " " + rank;
    }
}
