package Day33_Maps;

import Day32_Maps.MapMethods;

import java.util.Map;

public class C05_MapsMethods {

    public static void main(String[] args) {
        Map<Integer, String> studentMap = MapMethods.creataStudentMap();
        System.out.println(studentMap);
        studentMap.put(110, "");
        //map'e element eklersin
        //eklenen key zaten mevcutsa map'de eski value yenisi ile update edilir.

        studentMap.replace(102,"Aysegul-Man-11-M-MF");
        //bu haliyle put ile ayni islevi gorur

        studentMap.replace(103,"Ali-Cem-11-K-TM","Kubra-Can-10-K-TM");
        System.out.println(studentMap);

        //verilen key'in value'su bizim verdigimiz old ile ayni ise degistir.
        //degilse de degistirme islemini yapmaz.

        System.out.println("");
        System.out.println(studentMap.getOrDefault(103, "bu ogrenci map'de yok"));
        System.out.println(studentMap.getOrDefault(120, "bu ogrenci map'de yok"));
        //aranan key var ise onun value degerini return eder
        //aradigimiz deger yok ise default olarak verilen deger return edilir

        System.out.println(studentMap.containsKey(105));
        System.out.println(studentMap.containsValue("Ayse"));
        //contains value bir butun olarak belirlenen valu'lari kontrol eder
        //tek tek string'leri kontrol etmez
        //birebir key uzerinde verilen value ile eslesenleri true return eder

        System.out.println("");
        studentMap.putIfAbsent(120,"Nurhayat-Zan-12-M-Mf");
        studentMap.putIfAbsent(102,"Nurhayat-Zan-12-M-Mf");
        //if ther is no value inside de key's value then the method works and put it in value


    }


}
