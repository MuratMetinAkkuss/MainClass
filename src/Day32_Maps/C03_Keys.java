package Day32_Maps;

import java.util.Map;
import java.util.Set;

public class C03_Keys {
    public static void main(String[] args) {
        //her class'da map ile islem yapabilmek icin
        //bir map olusturmak ve ogrencileri eklemek zorundayiz
        //MapMethod'lar class'inda bir map olusturup
        //ogrecileri ekleyip bize donduren bir method olusturalim

        Map<Integer, String> studentMap = MapMethods.creataStudentMap();
        //System.out.println(studentMap);


        //Map'teki tum key'leri yazdirin?
        System.out.println(studentMap.keySet());

        // Bu set'i kaydetmek istersek neye kaydederiz?

        Set<Integer> keySet = studentMap.keySet();

        System.out.println(keySet);

        /*
        keySet'indeki ogrenci numaralarini asagidaki formatta yazdirin
        1-101
        2-102
        3-103
        4-104
        5-105
        6-106
         */
        int lineNum = 1 ;
        for (Integer eachKey:keySet
             ) {
            System.out.println(lineNum + "- " +eachKey);
            lineNum++;
        }

        //Tum ogrencilerin isim ve soyisimlerini bir liste olarak yazdiran
        // bir method olusturun.

        MapMethods.printwholeStudentsList(studentMap);


    }
}
