package J06005;


import java.util.*;
import java.io.*;

/**
 * Create on 27/10/2024 12:43 by jayce
 */

public class KH {
    private String id, name, sex, dob, address;

    public KH(String id, String name, String sex, String dob, String address) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.dob = dob;
        this.address = address;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return name + " " + address;
    }
}
