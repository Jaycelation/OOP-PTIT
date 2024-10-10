import java.util.*;

public class J08029 {
    static int[][] c = new int[10][10];

    static int[] dx = {-2, -2, -1, 1, 2, 2, 1, -1};
    static int[] dy = {-1, 1, 2, 2, 1, -1, -2, -2};

    public static void BFS(int ax, int ay, int bx, int by) {
        if (ax == bx && ay == by) {
            System.out.println(0); return;
        }
        for (int i = 0; i < 10; ++i) {
            Arrays.fill(c[i], -1);
        }

        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{ax, ay});
        c[ax][ay] = 0;

        while (true) {
            int [] temp = q.poll();
            int curX = temp[0];
            int curY = temp[1];

            for (int i = 0; i < 8; ++i) {
                int newX = curX + dx[i];
                int newY = curY + dy[i];
                if (newX >= 1 && newX <= 8 && newY >= 1 && newY <= 8 && c[newX][newY] == -1) {
                    q.add(new int[]{newX, newY});
                    c[newX][newY] = c[curX][curY]+1;
                }
            }
            if (c[bx][by] > 0) {
                break;
            }
        }
        System.out.println(c[bx][by]);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            String s = scanner.nextLine();
        }
    }
}
