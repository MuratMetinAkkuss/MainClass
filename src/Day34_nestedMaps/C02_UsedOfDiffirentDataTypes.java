package Day34_nestedMaps;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class C02_UsedOfDiffirentDataTypes {

    public static void main(String[] args) {

        /*
            Java'da farkli data type'larindan degerler eklemek istedigimiz
            herhangi bir non-primitive yapinin data type'ni object secebiliriz

            Bunun dezavantaji ise
            Elementler obje olarak
            kaydedildigi icin
            herhangi bir elementin asil data type'ina ait method'lari direkt kullanamayiz
            eger bir elementin data type 'i net olarak biliniyorsa
            ve o data turune ait
            bir methodu'u cagirmak istiyorsak
            data casting yapabiliriz.

         */


        List<String> studentList = new ArrayList<>();
        studentList.add("Sevda");
        //studentList.add(12);
        //studentList.add(true);


        //tum data turlerinde bilgiyi kabul edecek list olusturmak istersek
        //Data type can be Object

        List<Object> everyType = new ArrayList<>();
        everyType.add("Selgun");
        everyType.add(23);
        everyType.add(true);
        everyType.add('Q');
        System.out.println(everyType);

        //Print
        System.out.println(studentList.get(0).charAt(0));

        System.out.println(((String) (everyType.get(0))).charAt(0));

        System.out.println((Integer) everyType.get(1) * 2);

        //EveryType'daki 3. element true ise 'merhaba', false ise 'hoscakal' yazdirin

        if ((Boolean)everyType.get(2)){
            System.out.println("Merhaba");
        }else {
            System.out.println("Hoscakal");
        }

    }
}
