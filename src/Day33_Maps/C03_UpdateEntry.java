package Day33_Maps;

import Day32_Maps.MapMethods;

import java.util.Map;

public class C03_UpdateEntry {
    public static void main(String[] args) {
        //ogrenci map'inde yilsonu sinif artirin
        //12.siniftakiler icin sinif bilgisi olarak mezun yazin
        //mezun yazan varsa islem yapilmayacak

        Map<Integer,String> studentMap = MapMethods.creataStudentMap();
        studentMap.put(110,"Ilknur-Cem-12-K-Say");
        studentMap.put(111,"Esat-han-Mezun-K-Say");

        studentMap= MapMethods.makeProcessForEndOfYear(studentMap);

        System.out.println(studentMap);
    }
}
