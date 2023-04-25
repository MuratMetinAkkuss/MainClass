package Day16_ArrayList;

import java.util.Arrays;
import java.util.List;

public class C8_AsListMethodu {
    public static void main(String[] args) {
        Integer[] arr = {1,3,5};

        //verilen bir arreyi liste cevirmek icin for loop olusturup
        //liste eklemeyi tavsiye ediyoruz

        //yine de gormek adina negatif yanlarini gormek adina kullanalim

        List<Integer> arreydenList = Arrays.asList(arr);

        System.out.println(arreydenList);
    }
}
