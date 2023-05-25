package Day33_Maps;

import Day32_Maps.MapMethods;

import java.util.Map;

public class C02_entrySet {


    public static void main(String[] args) {

        /*  suana kadar bize bir map verildiginde
            key'lere ogrencimap.keySet() ile,
            value'lere ogrenciMap.values() ile ulasabiliyoruz
            eger hem key, hem de value ile islem yapmamiz gerekirse
            mecburen key'lerin bulundugu Set
            ve value'larin bulundugu Collection
            objelerini beraber yonetmemiz gerekiyordu
            Java key ve value'lari birlikte barindirmasi icin
            Entry isimli bir class olusturmustur
            Entry ile key ve value'yu birlikte kullanabilir,
            entry uzerinde yapilan update'leri otomatik olarak map'e isleyebiliriz
         */


        Map<Integer,String> newMap = MapMethods.creataStudentMap();
        //MapMethods.printwholeStudentsList(newList);

        //ogrenci listesini numara isim soyisim sinif seklinde yazdirin
        MapMethods.printAllStudentListWhithNumber(newMap);

    }
}
