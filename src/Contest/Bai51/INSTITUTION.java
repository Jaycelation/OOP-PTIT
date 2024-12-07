package Contest.Bai51;


import java.util.*;
import java.io.*;

public class INSTITUTION {
    private String maT, tenT;

    public INSTITUTION(String maT, String tenT) {
        this.maT = maT;
        this.tenT = tenT;
    }

    public String getMaT() {
        return maT;
    }

    public String getTenT() {
        return tenT;
    }

    @Override
    public String toString() {
        return tenT;
    }
}
