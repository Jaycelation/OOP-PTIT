package J04010;

public class Triangle {
    private Point p1 = new Point();
    private Point p2 = new Point();
    private Point p3 = new Point();

    private double a, b, c;

    public Triangle(double x1, double y1, double x2, double y2, double x3, double y3) {
        p1.setX(x1);
        p1.setY(y1);
        p2.setX(x2);
        p2.setY(y2);
        p3.setX(x3);
        p3.setY(y3);
        this.a = p1.distance(p2);
        this.b = p1.distance(p3);
        this.c = p2.distance(p3);
    }

    public double Heron(double a, double b, double c) {
        double S = Math.sqrt((a + b + c) * (a + b - c ) * (-a + b + c) * (a - b + c)) * 1/4;
        return S;
    }

    public double R(double a, double b, double c, double S) {
        double result = a*b*c/(4*S);
        return result;
    }

    @Override
    public String toString() {
        if (a + b <= c || a + c <= b || b + c <= a)
            return String.format("INVALID");
        return String.format("%.3f\n", Math.pow(R(a, b, c, Heron(a, b, c)), 2) * Math.PI);
    }
}
