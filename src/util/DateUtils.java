package util;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateUtils {

    public static void main(String[] args) {
//        System.out.println(LocalDateTime.now());
        String test = "20130801";
        System.out.println(String.format(test, "YYYY-mm-dd"));

    }

    public static String formatDate(String date, String format) {
        String test = "20130801";
        String.format(test, "YYYY-mm-dd");
        LocalDateTime.parse(date, DateTimeFormatter.ofPattern(format));
        return date;
    }

}
