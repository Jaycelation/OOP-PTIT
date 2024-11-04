package J04019;


import java.util.*;
import java.io.*;

/**
 * Create on 15/10/2024 15:56 by jayce
 */

public class Triangle {
    private double a, b, c;

    public Triangle(Point a, Point b, Point c) {
        this.a = a.distance(b);
        this.b = b.distance(c);
        this.c = c.distance(a);
    }
    public boolean valid() {
        return (a + b > c) && (a + c > b) && (c + b > a) && a > 0 && b > 0 && c > 0;
    }
    public String getPerimeter(){
        double res = a + b + c;
        return String.format("%.3f", res);
    }
}
