package Day32_Maps;

import java.util.*;

public class C01_MapCreate {
    public static void main(String[] args) {
        //variable olusturma
        int sayi = 5;
        String str = "Java Candir";

        //Coklu element barindiran collections olusturma

        List<String> list = new ArrayList<>();
        Set<Integer> sayiSeti = new HashSet<>();

        //Map olustururken her zaman key-value ikilisi barindirir.
        //bu ozelligi sebebiyle Map olustururken
        //key ve value'nun data type'lari yazilmaldir.

        Map<Integer, String> schoolMap = new HashMap<>();
        schoolMap.put(101,"“Ali-Can-11-H-MF”");
        schoolMap.put(102,"Veli-Cem-10-K-TM");
        schoolMap.put(103,"“Ali-Cem-11-K-TM”");
        schoolMap.put(104,"“Ayse-Can-10-H-MF”");
        schoolMap.put(105,"“Sevgi-Cem-11-M-TM”");
        schoolMap.put(106,"“Sevgi-Can-10-K-MF”");

        System.out.println(schoolMap);
        //Map'i yazdigimizda key=value seklinde yazar
        //= atama isareti degildir,yazdirirken bilgi vermek icin boyle yazilir

        System.out.println(schoolMap.get(101));
        //“Ali-Can-11-H-MF”

        //103 numarali ogrencinin subesini yazdiriniz.
        //Map'te tum bilgiler String olarak birlestirilen value icerisindedir.
        //String'deki bir bilgiye direkt ulasamayiz.
        //manipulation yapi istedigimiz bilgiye ulasmaliyiz.

        //1-Once istenen ogrencin valusunu bulalim

        String value103 = schoolMap.get(103);

        //2-Value ozel bir isaretle birlestirilen farkli bilgilerden olusur.
        //Split("-") ile bu bilgileri bir array'e donusturup kaydedelim
        String[] valueArr = value103.split("-");

        System.out.println(Arrays.toString(valueArr));


        //3-Artik istedigim bilgiye tanimli index ile ulasabilirim.
        System.out.println(valueArr[3]);
    }
}
