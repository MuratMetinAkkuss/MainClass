package Day33_Maps;

import java.util.Map;
import java.util.TreeMap;

public class C08_ComputeSolution {
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

        for (String each:letters
             ) {
            usageLetterMap.computeIfPresent(each,(k,v) -> v+1);
            usageLetterMap.putIfAbsent(each,1);

        }
        System.out.println(usageLetterMap);
    }
}
