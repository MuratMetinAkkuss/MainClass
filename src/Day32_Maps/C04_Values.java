package Day32_Maps;

import java.util.Map;

public class C04_Values {
    public static void main(String[] args) {


        Map<Integer,String> studentMap = MapMethods.creataStudentMap();
       // System.out.println(studentMap);

        //tum ogrencilerin sadece valuelarini yazdirin
       // System.out.println(studentMap.values());
        //Ali-Can-11-H-MF,
        // Veli-Cem-10-K-TM,
        // Ali-Cem-11-K-TM,
        // Ayse-Can-10-H-MF,
        // Sevgi-Cem-11-M-TM,
        // Sevgi-Can-10-K-MF]

        // istenen siniftaki tum ogrencilerin isim ve soy isimlerini yazdirin

        //MapMethods.printStudentsOfWantedClass(studentMap,11);


        //verilen soyisme sahip tum ogrencileri yazdirin

        MapMethods.soyisimOgrenciBulma(studentMap,"Cem");
        MapMethods.soyisimOgrenciBulma2(studentMap, "Can");


        //verilen sube'deki tum ogrencileri yazdirin

        //verilen sinif ve subedeki tum ogrencileri yazdirin


    }
}
