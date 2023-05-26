package Day33_Maps;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class C07_Compute {

    public static void main(String[] args) {
        Map<String, Integer> usedletterwithnumbers = new TreeMap<>();

        usedletterwithnumbers.put("A", 20);
        usedletterwithnumbers.put("K", 10);
        usedletterwithnumbers.put("C", 25);
        usedletterwithnumbers.put("M", 23);
        usedletterwithnumbers.put("Z", 32);

        System.out.println(usedletterwithnumbers);

        // A'nin degerini 2 katina cikarin

        int oldvalue = usedletterwithnumbers.get("A");//20
        usedletterwithnumbers.put("A", 2 * oldvalue);
        System.out.println(usedletterwithnumbers);

        //B varsa degerini 3 arttirin

        if (usedletterwithnumbers.containsKey("B")) {
            oldvalue = usedletterwithnumbers.get("B");
            usedletterwithnumbers.put("B", oldvalue + 3);
        }

        /*
        Java var olan veya olmayan element key'lerin
        value'leri uzerinde islem yapmak icin ozel iki method gelistirmis

        bu method'lar functional programing (lambda) kullanarak calisir.

         */

        //A'nin degerini iki katina cikarin

        usedletterwithnumbers.compute("A", (k, v) -> 2 * v);
        System.out.println(usedletterwithnumbers);
        //Key olarak verilen Anin degerini functional olarak iki katina cikarmistir.

        //B varsa degerini 3 arttirin
        usedletterwithnumbers.computeIfPresent("B", (k, v) -> v + 3);
        usedletterwithnumbers.computeIfPresent("M", (k, v) -> v + 3);
        System.out.println(usedletterwithnumbers);
        System.out.println("");

        //B yoksa degerini 5 atayin
        usedletterwithnumbers.computeIfAbsent("B", (v) -> 5);
        System.out.println(usedletterwithnumbers);


    }

}
