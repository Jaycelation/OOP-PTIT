import java.io.*;

public class J07005  {
    public static void main(String[] args) throws IOException {
        DataInputStream dataInputStream = new DataInputStream(new FileInputStream("DATA.IN"));
        int[] data = new int[1005];
        for (int i = 0; i < 100000; ++i)
            ++data[dataInputStream.readInt()];
        for (int i = 0; i <= 1000; ++i)
            if (data[i] > 0)
                System.out.println(i + " " + data[i]);
    }
}