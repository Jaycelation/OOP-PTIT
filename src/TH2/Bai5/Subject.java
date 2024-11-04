package Bai5;

public class Subject {
    private String id, name, expression;
    public Subject(String id, String name, String expression) {
        this.id = id;
        this.name = name;
        this.expression = expression;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + expression;
    }
}
