package Day15_multiDimensionalArrays;

import java.util.ArrayList;
import java.util.List;

public class C07_removeMethodu {
    public static void main(String[] args) {

        String[] harfler = {"a","h","d","k","m","e","t","a","k"};
        List<String> harfList = new ArrayList<>();

        for (int i = 0; i < harfler.length; i++) {
            harfList.add(harfler[i]);
        }
        System.out.println(harfList);

        System.out.println(harfList.remove("h"));
        System.out.println(harfList);

        System.out.println(harfList.remove("x"));
        System.out.println(harfList);

        //remove() unda obje veririsek bulursa siler ve true verir
        //bulamazsa silemedigi icin false return

        System.out.println(harfList.remove(2));
        System.out.println(harfList);

        //remove() methodu index ile verilirse index liste icinde varsa
        // elemani siler ve sildigi elemani bize dondurur
        //index yoksa exception olusur

        System.out.println(harfList.remove(23));


    }
}
