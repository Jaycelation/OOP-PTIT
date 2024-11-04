package Bai4;

public class Student {
    private String name;
    private int trueSubmit, totalSubmit;
    public Student(String name, int trueSubmit, int totalSubmit) {
        this.name = name;
        this.trueSubmit = trueSubmit;
        this.totalSubmit = totalSubmit;
    }

    public int getTrueSubmit() {
        return trueSubmit;
    }

    public int getTotalSubmit() {
        return totalSubmit;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name + " " + trueSubmit + " " + totalSubmit;
    }
}
