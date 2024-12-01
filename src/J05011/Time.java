package J05011;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.io.*;
import java.util.concurrent.TimeUnit;

public class Time {
    private String id, name, timeStart, timeEnd;
    long time, hours, minues;
    public Time(String id, String name, String timeStart, String timeEnd) {
        this.id = id;
        this.name = name;
        this.timeStart = timeStart;
        this.timeEnd = timeEnd;
        SimpleDateFormat formatter = new SimpleDateFormat("HH:mm");
        try {
            long startMillis = formatter.parse(timeStart).getTime();
            long endMillis = formatter.parse(timeEnd).getTime();
            time = endMillis - startMillis;
            hours = TimeUnit.MILLISECONDS.toHours(time);
            minues = TimeUnit.MILLISECONDS.toMinutes(time) % 60;
        } catch (ParseException e) {

        }
    }

    public long getTime() {
        return time;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + hours + " gio " + minues + " phut";
    }
}
