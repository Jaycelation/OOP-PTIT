package J07046;

import java.time.temporal.ChronoUnit;
import java.time.format.DateTimeFormatter;
import java.time.LocalDate;

/**
 * Create on 03/11/2024 20:47 by jayce
 */

public class Customer {
    private String idC, name, idR, dateS, dateE;

    public Customer(String idC, String name, String idR, String dateS, String dateE) {
        this.idC = idC;
        this.name = name;
        this.idR = idR;
        this.dateS = dateS;
        this.dateE = dateE;
    }

    public long getDate(String dateS, String dateE) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate startDate = LocalDate.parse(dateS, formatter);
        LocalDate endDate = LocalDate.parse(dateE, formatter);
        long daysBetween = ChronoUnit.DAYS.between(startDate, endDate);
        return daysBetween;
    }

    public long getD() {
        return getDate(dateS, dateE);
    }

    @Override
    public String toString() {
        return idC + " " + name + " " + idR + " " + getDate(dateS, dateE);
    }
}
