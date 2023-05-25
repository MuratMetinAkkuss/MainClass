package Day33_Maps;

import Day32_Maps.MapMethods;

import java.util.Map;

public class C04_UpdateEntry {

    public static void main(String[] args) {
        //ogrenci map'indeki tum soyisimleri buyuk harfe ceviriniz

        Map<Integer, String> studentMap = MapMethods.creataStudentMap();


        studentMap = MapMethods.makeLastNameUpperCase(studentMap);

        System.out.println(studentMap);



    }

}
