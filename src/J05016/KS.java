package J05016;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

/**
 * Create on 02/11/2024 22:04 by jayce
 */

public class KS {
    private String id, name;
    private String dateStart, dateEnd;
    private String rooms;
    private int service;
    private long total;
    public KS(String id, String name, String rooms, String dateStart, String dateEnd, int service) {
        this.id = id;
        this.name = name;
        this.dateStart = dateStart;
        this.dateEnd = dateEnd;
        this.rooms = rooms;
        this.service = service;
    }

    public long getTotal() {
        return cost();
    }

    public long days() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate x = LocalDate.parse(dateStart.trim(), formatter);
        LocalDate y = LocalDate.parse(dateEnd.trim(), formatter);
        return ChronoUnit.DAYS.between(x, y) + (long)1;
    }

    public long cost() {
        char c = rooms.charAt(0);
        long total = (long)service;
        if (c - '0' == 1) {
            total +=  (long)25*days();
        } else if (c - '0' == 2) {
            total += (long)34*days();
        } else if (c - '0' == 3) {
            total += (long)50*days();
        } else if (c - '0' == 4) {
            total += (long)80*days();
        }
        return total;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + rooms + " " + days() + " " + cost();
    }
}
