package Day32_Maps;

import java.util.Map;

public class C06_Update {
    public static void main(String[] args) {
        Map<Integer, String> studentMap = MapMethods.creataStudentMap();

        //numarasi verilen ogrencinin soy ismini yeni verilen deger ile udate edin

        System.out.println(studentMap);

        //ornek olarak 102 numarali ogrencin soy ismini han yapalim

        studentMap = MapMethods.lastNameUpdateWithNumber(studentMap, 102 , "Han");

        System.out.println(studentMap);


    }
}
