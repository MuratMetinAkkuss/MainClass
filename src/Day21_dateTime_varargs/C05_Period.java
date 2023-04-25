package Day21_dateTime_varargs;

import java.time.LocalDate;
import java.time.Period;

public class C05_Period {
    public static void main(String[] args) {

        LocalDate dogumtarihi = LocalDate.of(1999,1,4);
        LocalDate bugun = LocalDate.now();

        Period yasim = Period.between(dogumtarihi,bugun);
        System.out.println(yasim);

    }
}
