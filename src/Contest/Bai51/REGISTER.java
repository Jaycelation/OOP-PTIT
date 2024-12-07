package Contest.Bai51;


import java.util.*;
import java.io.*;

public class REGISTER {
    private String tenR;
    private INSTITUTION institution;

    public REGISTER(String tenR, INSTITUTION institution) {
        this.tenR = tenR;
        this.institution = institution;
    }

    public String getTenR() {
        return tenR;
    }

    public String getTenT() {
        return institution.getTenT();
    }

    @Override
    public String toString() {
        return tenR + " " + institution;
    }
}
