package Day32_Maps;

import java.util.HashMap;
import java.util.Map;

public class C02_DataAccess {
    public static void main(String[] args) {
        /*
            Numarasi verilen ogrencinin isim ve soyismini
            ilk harfleri buyuk sonraki harfler kucuk olacak
            sekilde yazdirin.

            **
            Map'te bir bilgiye erisim bir kac adim ile mumkun oldugundan
            bu islemleri method olarak olsuturup
            ihtiyac duyuldugunda kullanmak daha kullanisli olacaktir.
         */


        Map<Integer, String> schoolMap = new HashMap<>();
        schoolMap.put(101,"Ali-Can-11-H-MF");
        schoolMap.put(102,"Veli-Cem-10-K-TM");
        schoolMap.put(103,"Ali-Cem-11-K-TM");
        schoolMap.put(104,"Ayse-Can-10-H-MF");
        schoolMap.put(105,"Sevgi-Cem-11-M-TM");
        schoolMap.put(106,"Sevgi-Can-10-K-MF");


        //Map ve ogrenci numarasi verdigimizde istedigimiz formatta
        //isim soyisim bilgisini bize donduren bir method olusturalim

        System.out.println(MapMethods.searchWithNumber(schoolMap, 103));


    }
}
