package day15;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.SimpleTimeZone;

public class DateandTime {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yy hh-MM-ss-SSS");
        String format=simpleDateFormat.format(date);
        System.out.println(format);

        date = new Date();
        System.out.println(date);
        simpleDateFormat = new SimpleDateFormat("dd-MM-yy hh-MM-ss-SSS");
        format=simpleDateFormat.format(date);
        System.out.println(format);

        date = new Date();
        System.out.println(date);
        simpleDateFormat = new SimpleDateFormat("dd-MM-yy hh-MM-ss-SSS");
        format=simpleDateFormat.format(date);
        System.out.println(format);
    }
}
