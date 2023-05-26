package Day34_nestedMaps;

import java.util.HashMap;
import java.util.Map;

public class C01_NestedMap {
    public static void main(String[] args) {

        /*
            ogrencileri map'e eklerken key oolarak
            numara value olarak tum bilgiyi girdigimizde
            ogrenciyi eklemektek bir satir surerken
            ogrencinin bilgisine ulasmak veya update etmek
            cok uzun surmektedir.

            Eger bilgilere ereisim ve update'in
            daha hizli yapilabilmesini istersek
            Neste Map kullanabiliriz.

            BuOgrencileri ve bilgilerini Nested Map olarak
            girmek uzun olacaktir, ancak erisim ve update'in
            kisa olmasi icin bunu tercih edebiliriz.

            Bir tane ogrenci Map'i olacak
            ve buna bagli her key'in farkli farkli
            value degeri olacak

         */
        Map<Integer,Map<String,String>> studentMap = new HashMap<>();

        Map<String,String> studentInfoMap101 = new HashMap<>();
        studentInfoMap101.put("Isim","Ali");
        studentInfoMap101.put("Soyisim","Can");
        studentInfoMap101.put("Sinif","11");
        studentInfoMap101.put("Sube","H");
        studentInfoMap101.put("Brans","MF");

        studentMap.put(101,studentInfoMap101);



        Map<String,String> studentInfoMap102 = new HashMap<>();
        studentInfoMap102.put("Isim","Veli");
        studentInfoMap102.put("Soyisim","Cem");
        studentInfoMap102.put("Sinif","10");
        studentInfoMap102.put("Sube","K");
        studentInfoMap102.put("Brans","TM");

        studentMap.put(102,studentInfoMap102);

        Map<String,String> studentInfoMap103 = new HashMap<>();
        studentInfoMap103.put("Isim","Ali");
        studentInfoMap103.put("Soyisim","Cem");
        studentInfoMap103.put("Sinif","11");
        studentInfoMap103.put("Sube","K");
        studentInfoMap103.put("Brans","TM");

        studentMap.put(103,studentInfoMap103);

        Map<String,String> studentInfoMap104 = new HashMap<>();
        studentInfoMap104.put("Isim","Asli");
        studentInfoMap104.put("Soyisim","Can");
        studentInfoMap104.put("Sinif","12");
        studentInfoMap104.put("Sube","K");
        studentInfoMap104.put("Brans","MF");

        studentMap.put(104,studentInfoMap104);

        System.out.println(studentMap);

        System.out.println(studentMap.get(101));
        //101'in bilgileri

        //102 no'lu ogrencinin soy ismi
        System.out.println(studentMap.get(102).get("Soyisim"));


        //103 numarali ogrencin bransini yazdirin
        System.out.println(studentMap.get(103).get("Brans"));


    }
}
