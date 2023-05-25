package Day31_iterator_Collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class C06_SetSoru {
    public static void main(String[] args) {
        /*
        verilen bir array'dan tekrar eden elementleri silip
        uniq elementlerden olusan halini array'e kaydedin

         */

        Integer[] sayilar = {2,3,1,5,23,1,342,54,6,21,1,2,3,3,4,5,5,6,1};

        //set dublication'a izin vermediginden. Bir set olusturup
        //tum elementleri set'e ekleyelim

        Set<Integer> sayilarSeti = new HashSet<>();

        for (Integer each:sayilar
             ) {
            sayilarSeti.add(each);
        }
        System.out.println(sayilarSeti);

        //array'i bu elementler ile guncelleyelim

        sayilar = new Integer[sayilarSeti.size()];

        int index = 0 ;
        for (Integer each: sayilarSeti
             ) {
            sayilar[index]=each;
            index++;
        }
        System.out.print("Array'in son hali : ");
        System.out.println(Arrays.toString(sayilar));
    }
}
