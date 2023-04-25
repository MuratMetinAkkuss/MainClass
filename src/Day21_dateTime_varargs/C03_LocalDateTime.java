package Day21_dateTime_varargs;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class C03_LocalDateTime {
    public static void main(String[] args) {
        LocalDateTime ts = LocalDateTime.now();

        System.out.println(ts);

        // tarih ve saati su sekilde yazdirin 25/04/2023 11:04

        System.out.println(ts.getDayOfMonth() + "/" + ts.getMonthValue() + "/" +
                ts.getYear() + " " + ts.getHour() + ":" + ts.getMinute());


    }
}
