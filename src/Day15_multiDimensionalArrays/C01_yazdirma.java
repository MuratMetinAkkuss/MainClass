package Day15_multiDimensionalArrays;

import java.util.Arrays;

public class C01_yazdirma {
    public static void main(String[] args) {

        /*
            MDA yazdirma islemi yaparken
            yazdirmak istedgimizin ne olduguna bakmamiz gerekir
            -   element ise yazdirabilir
            -   tek katli bir array ise Arrays.toString() kullanabiliriz.
            -   MDA ise Array.deeptoString() methodu kullanmaliyiz.
         */

        int[][] arr = {{1,5,9},{3,4},{2,8,1,2},{10}};

        System.out.println(arr[0][0]);
        System.out.println(arr[2].length);
        System.out.println(arr[3].length);
        //System.out.println(arr[2][1]);
        //bir element oldugu icin elemet olmaz
        System.out.println(arr[1].length);

        System.out.println(Arrays.toString(arr[2]));

        System.out.println(arr);

        System.out.println(Arrays.toString(arr));
        //burda ilk kat array elementleri gelir referans cikar
        System.out.println(Arrays.deepToString(arr));
        //burda elementin butun katlarina iner

    }
}
