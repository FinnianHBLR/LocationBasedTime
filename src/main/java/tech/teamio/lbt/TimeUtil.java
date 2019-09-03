package tech.teamio.lbt;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeUtil {
    public static long calTime(){
    long time = 0;

        DateFormat hours = new SimpleDateFormat("HH");
        DateFormat minutes = new SimpleDateFormat("mm");
        Date date = new Date();
        String hoursStr = hours.format(date);
        String minutesStr = minutes.format(date);

        double temp = (( Integer.parseInt(hoursStr)* 1000 ) - 6000 ) + ( Integer.parseInt(minutesStr)* 16.7 );
        time = (long)temp;
        System.out.println(hoursStr + minutesStr + "=" + time);
        return time;
    }
}
