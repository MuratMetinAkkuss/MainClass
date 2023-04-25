package Day15_multiDimensionalArrays;

import java.util.ArrayList;
import java.util.List;

public class C06_get {
    public static void main(String[] args) {

        /*
            eger uzun bir liste olsuturmak istiyorsak
            bir array olusuturp
            loop ile tum elemetleri olusturdugumuz List'e ekleyebiliriz
         */
        int[] sayilar = {3,5,6,3,1,2,5,7,5,3,4,2,3,5,6};
        List<Integer> sayiList = new ArrayList<>();

        for (int i = 0; i < sayilar.length; i++) {
            sayiList.add(sayilar[i]);
        }
        System.out.println(sayiList);

        String[] harfler = {"a","h","d","k","m","e","t","a","k"};
        List<String> harfList = new ArrayList<>();

        for (int i = 0; i < harfler.length; i++) {
            harfList.add(harfler[i]);
        }
        System.out.println(harfList);

        System.out.println("================get================");

        System.out.print(harfList.get(5) + " ");
        System.out.print(harfList.get(0)+ " ");
        System.out.println(harfList.get(harfList.size()-1)+ " ");

        System.out.print(sayiList.get(4)+ " ");
        System.out.print(sayiList.get(sayiList.size() - 1)+" ");


    }
}
