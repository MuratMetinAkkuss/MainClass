package Day21_dateTime_varargs;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class C04_DateTimeFormatter {
    public static void main(String[] args) {

        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("dd/MMM/yyyy hh:mm a");
        LocalDateTime ts = LocalDateTime.now();
        System.out.println(ts);
        System.out.println(ts.format(dtf1));

        DateTimeFormatter dtf2 =DateTimeFormatter.ofPattern("d.M.yy HH:mm");
        System.out.println(ts.format(dtf2));


    }
}
