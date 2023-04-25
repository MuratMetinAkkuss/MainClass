package Day21_dateTime_varargs;

import java.time.LocalTime;

public class C01_LocalTime {
    public static void main(String[] args) {


        LocalTime saat = LocalTime.now();
        //calistigi anda sistem saati ne ise onu veriyor.
        //kronometre gibi calismaz sadece 9. satirin calistigi zamani kaydeder
        //eger farkli satirlarin calisma zamanlarini gormek istersek
        //o satirlarda da yeni LocalTime objeleri olusturmaliyiz

        System.out.println(saat);
        //zamani saat, dakika. saniye ve nano saniye olarak kaydeder

        System.out.println(saat.getNano());
        System.out.println(saat.getSecond());

        System.out.println(saat.withHour(14));

    }
}
