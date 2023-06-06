package javacalendar;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalendarSinifi {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.getTimeZone());
        System.out.println(calendar.getCalendarType());

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd ");
        System.out.println("Gün: " + simpleDateFormat.format(calendar.getTime()));

        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("MM");
        System.out.println("Ay: " + simpleDateFormat2.format(calendar.getTime()));

        SimpleDateFormat simpleDateFormat3 = new SimpleDateFormat("yyyy");
        System.out.println("Yıl: " + simpleDateFormat3.format(calendar.getTime()));
    }
}
