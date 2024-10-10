package J04002;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Rectange rectange = new Rectange();
        double x = scanner.nextDouble();
        rectange.setWidth(x);
        x = scanner.nextDouble();
        rectange.setHeight(x);
        String s = scanner.next();
        s = s.toLowerCase();
        s = String.valueOf(s.charAt(0)).toUpperCase() + s.substring(1);
        rectange.setColor(s);
        if(rectange.getWidth() > 0 && rectange.getHeight() > 0)
            System.out.printf("%.0f %.0f %s", rectange.findPerimeter(), rectange.findArea(), rectange.getColor());
        else
            System.out.print("INVALID");
    }
}
