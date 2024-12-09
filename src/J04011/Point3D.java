package J04011;

public class Point3D {
    public static short[][] res = new short[4][3];
    public static int[] tmp = new int[3];
    public static int sum;

    private short x, y, z;

    public Point3D(int x, int y, int z) {
        this.x = (short) x;
        this.y = (short) y;
        this.z = (short) z;
    }

    public static boolean check(Point3D p1, Point3D p2, Point3D p3, Point3D p4) {
        res[0][0] = p1.x;
        res[0][1] = p1.y;
        res[0][2] = p1.z;

        res[1][0] = p2.x;
        res[1][1] = p2.y;
        res[1][2] = p2.z;

        res[2][0] = p3.x;
        res[2][1] = p3.y;
        res[2][2] = p3.z;

        res[3][0] = p4.x;
        res[3][1] = p4.y;
        res[3][2] = p4.z;

        // Tính vector từ điểm đầu đến các điểm khác
        for (int i = 1; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                res[i][j] = (short) (res[i][j] - res[0][j]);
            }
        }

        // Tích có hướng của hai vector đầu tiên
        tmp[0] = res[2][2] * res[1][1] - res[2][1] * res[1][2];
        tmp[1] = res[1][2] * res[2][0] - res[1][0] * res[2][2];
        tmp[2] = res[1][0] * res[2][1] - res[1][1] * res[2][0];

        // Kiểm tra tích vô hướng của vector thứ ba với kết quả
        sum = tmp[0] * res[3][0] + tmp[1] * res[3][1] + tmp[2] * res[3][2];

        return sum == 0;
    }
}