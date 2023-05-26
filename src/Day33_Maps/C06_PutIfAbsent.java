package Day33_Maps;

import java.util.Map;
import java.util.TreeMap;

public class C06_PutIfAbsent {
    public static void main(String[] args) {
        /*
        Soru : Verilen bir array’de kullanilan sayilari ve kacar defa kullanildigini yazdirin.
        Input : {"a","b","s","a","s","c","d","b","c","a","a","s","z","k"}
        output :a kullanimi : 4 adet
                b kullanimi : 2 adet
                c kullanimi : 2 adet
                d kullanimi : 1 adet
                k kullanimi : 1 adet
                s kullanimi : 3 adet
                z kullanimi : 1 adet
         */

        String[] letters = {"a","b","s","a","s","c","d","b","c","a","a","s","z","k"};

        //first soluation
        Map<String,Integer> usageLetterMap = new TreeMap<>();

        // her bir harfi ele alalim
        //harf map'te yoksa key = harf value = 1 olarak ekleyelim
        //Harf map'de varsa kullanim sayisi olarak tuttugumuz value'u bir arttiralim

        for (String each: letters
             ) {
            if (!usageLetterMap.containsKey(each)){
                usageLetterMap.put(each,1);
            }else {
                int currentUsageNumber = usageLetterMap.get(each);

                usageLetterMap.put(each,currentUsageNumber+1);
            }
        }
        System.out.println(usageLetterMap);

        //second soluation

        Map<String,Integer> usageLetterMap2 = new TreeMap<>();

        for (String each:letters
             ) {

            if (usageLetterMap2.putIfAbsent(each,1) != null){

                int currentUsageNumber = usageLetterMap2.get(each);

                usageLetterMap2.put(each,currentUsageNumber+1);
            }
        }
        System.out.println(usageLetterMap2);
    }
}
