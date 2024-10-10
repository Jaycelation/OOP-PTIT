package J04011;

public class Point3D {
    static short[][] point = new short[4][3];
    static int[] tmp = new int[3];
    static int sum;

    private short x, y, z;

    public Point3D(int x, int y, int z) {
        this.x = (short) x;
        this.y = (short) y;
        this.z = (short) z;
    }

    public static boolean check(Point3D p1, Point3D p2, Point3D p3, Point3D p4) {
        point[0][0] = p1.x;
        point[0][1] = p1.y;
        point[0][2] = p1.z;
        point[1][0] = p2.x;
        point[1][1] = p2.y;
        point[1][2] = p2.z;
        point[2][0] = p3.x;
        point[2][1] = p3.y;
        point[2][2] = p3.z;
        point[3][0] = p4.x;
        point[3][1] = p4.y;
        point[3][2] = p4.z;

        for (int i = 1; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                point[i][j] = (short) (point[i][j] - point[0][j]);
            }
        }

        tmp[0] = point[2][2] * point[1][1] - point[2][1] * point[1][2];
        tmp[1] = point[1][2] * point[2][0] - point[1][0] * point[2][2];
        tmp[2] = point[1][0] * point[2][1] - point[1][1] * point[2][0];

        sum = tmp[0] * point[3][0] + tmp[1] * point[3][1] + tmp[2] * point[3][2];

        return sum == 0;
    }
}