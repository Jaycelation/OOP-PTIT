package J04001;
import java.util.*;
public class Main {
    public static double distance(Point p1, Point p2) {
        return Math.sqrt((p1.getX()-p2.getX())*(p1.getX()-p2.getX()) + (p1.getY()-p2.getY())*(p1.getY()-p2.getY()));
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            Point A = new Point(scanner.nextDouble(), scanner.nextDouble());
            Point B = new Point(scanner.nextDouble(), scanner.nextDouble());
            A.setDist(A.distance(B));
            System.out.println(A);
        }
    }
}
