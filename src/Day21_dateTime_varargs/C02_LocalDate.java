package Day21_dateTime_varargs;

import java.time.LocalDate;

public class C02_LocalDate {
    public static void main(String[] args) {


        LocalDate tarih = LocalDate.now();
        System.out.println(tarih);

        LocalDate tarih2 = LocalDate.ofYearDay(2024, 200);
        System.out.println(tarih2);

        System.out.println(tarih.isAfter(tarih2));

        System.out.println(tarih.isLeapYear());
        System.out.println(tarih2.isLeapYear());

        System.out.println(tarih.datesUntil(tarih2).count());
    }
}
