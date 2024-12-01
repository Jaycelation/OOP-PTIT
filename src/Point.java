import java.util.Scanner;

public class Point {
    private double x;
    private double y;

    public Point() {
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public Point(Point p){
        this.x = p.x;
        this.y = p.y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
    public double distance(Point p){
        return Math.sqrt(Math.pow(p.x - this.x,2 )+ Math.pow(p.y- this.y, 2));
    }
    public double distance(Point a, Point b){
        return Math.sqrt(Math.pow(a.x - b.x,2 )+ Math.pow(a.y- b.y, 2));
    }

    @Override
    public String toString() {
        return "Point{" + "x=" + x + ", y=" + y + '}';
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        while( t-- > 0){
            Point[] arr = new Point[3];
            for( int i=0;i<3;i++){
                double x = sc.nextDouble();
                double y = sc.nextDouble();
                arr[i] = new Point(x, y);
            }
            double a = arr[0].distance(arr[1]);
            double  b= arr[1].distance(arr[2]);
            double c= arr[0].distance(arr[2]);
            if (a+b <= c || b+c <= a || c+a <= b){
                System.out.println("INVALID");
            } else {
                System.out.println(String.format("%.3f", a+b+c));
            }
        }
    }

}
