package Day16_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class C10_forEachLoopSoru {
    /*
    Soru 3- Verilen String bir array’deki her bir elementi kontrol edip,
 - Kelimenin uzunlugu cift sayi ise ilk yarisini
 - Kelimenin uzunlugu tek sayi ise ortadaki harf dahil ikinci yarisini
 yeni bir listeye ekleyip yazdirin.
     */
    public static void main(String[] args) {
        String[] arr = {"araba","mehmet","naber","selam","iyisin"};
        stringalma(arr);

    }

    public static void stringalma(String [] arr){

        List<String> manipuleKelimeler = new ArrayList<>();

        for (String each:arr
             ) {
            if (arr.length%2==0){
                manipuleKelimeler.add(each.substring(0,each.length()/2));
            }else {
                manipuleKelimeler.add(each.substring((each.length()-1)/2 , each.length()));
            }
        }
        System.out.println( manipuleKelimeler);

    }

}
