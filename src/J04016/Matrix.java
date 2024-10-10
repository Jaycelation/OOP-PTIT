package J04016;

import java.util.*;

public class Matrix {
    private int[][] arr;
    private int n, m;

    public int[][] getArr() {
        return arr;
    }

    public void setArr(int[][] arr) {
        this.arr = arr;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public int getM() {
        return m;
    }

    public void setM(int m) {
        this.m = m;
    }

    public Matrix(int n, int m) {
        this.arr = new int[n][m];
        this.n = n;
        this.m = m;
    }

    public Matrix() {
    }

    public void nextMatrix(Scanner scanner) {
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < m; ++j) {
                arr[i][j] = scanner.nextInt();
            }
        }
    }

    public Matrix mul(Matrix A) {
        Matrix res = new Matrix(n, A.m);
        for (int i = 0; i < n; ++i)
            for (int j = 0; j < A.m; ++j)
                for (int z = 0; z < m; ++z)
                    res.arr[i][j] += this.arr[i][z] * A.arr[z][j];
        return res;
    }

    @Override
    public String toString() {
        String res = "";
        for (int i = 0; i < n; ++i)
        {
            for (int j = 0; j < m; ++j)
                res += Integer.toString(arr[i][j]) + " ";
            res += "\n";
        }
        return res;
    }
}
